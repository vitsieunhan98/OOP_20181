package com.ag.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import com.ag.entity.Location;
import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;

public class CreateLocationIRI extends ConnectDB implements ICreateIRI<Location>{

	public CreateLocationIRI() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Location et) {
		// TODO Auto-generated method stub
		AGRepository myRepo = connectDB();
		ValueFactory f = myRepo.getValueFactory();
		
		IRI location = f.createIRI(ENTITY.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		
		AGRepositoryConnection conn = myRepo.getConnection();
		
		conn.add(location, RDF.TYPE, LOCATION);
		conn.add(location, LABEL, label);
		conn.add(location, DESCRIPTION, description);
		conn.add(location, TIME_EXTRACTED, time_extracted);
		conn.add(location, LINK, link);
		
		return location;
	}

}
