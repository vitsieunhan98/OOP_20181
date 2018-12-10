package com.ag.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Model;
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
	public IRI createIRI(Location et, Model model) {
		// TODO Auto-generated method stub
		
		IRI location = f.createIRI(LOCATION.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		
		model.add(location, RDF.TYPE, LOCATION);
		model.add(location, LABEL, label);
		model.add(location, DESCRIPTION, description);
		model.add(location, TIME_EXTRACTED, time_extracted);
		model.add(location, LINK, link);
		
		return location;
	}

}
