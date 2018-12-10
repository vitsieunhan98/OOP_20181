package com.ag.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.util.ModelBuilder;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import com.ag.entity.Country;
import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;

public class CreateCountryIRI extends ConnectDB implements ICreateIRI<Country>{

	public CreateCountryIRI() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Country et, Model model) {
		// TODO Auto-generated method stub
		IRI country = f.createIRI(COUNTRY.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		
		model.add(country, RDF.TYPE, COUNTRY);
		model.add(country, LABEL, label);
		model.add(country, DESCRIPTION, description);
		model.add(country, TIME_EXTRACTED, time_extracted);
		model.add(country, LINK, link);
		
		return country;
		
	}

}
