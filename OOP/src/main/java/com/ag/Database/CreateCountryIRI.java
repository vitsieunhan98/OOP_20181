package com.ag.Database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;

import com.ag.Entity.Country;

public class CreateCountryIRI extends ConnectDB implements ICreateIRI<Country>{

	public CreateCountryIRI() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Country et) {
		// TODO Auto-generated method stub
		AGRepository myRepo = connectDB();
		ValueFactory f = myRepo.getValueFactory();
		
		IRI country = f.createIRI(COUNTRY.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		
		AGRepositoryConnection conn = myRepo.getConnection();
		
		conn.add(country, RDF.TYPE, COUNTRY);
		conn.add(country, LABEL, label);
		conn.add(country, DESCRIPTION, description);
		conn.add(country, TIME_EXTRACTED, time_extracted);
		conn.add(country, LINK, link);
		
		return country;
	}

}