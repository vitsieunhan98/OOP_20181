package com.ag.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import com.ag.entity.*;
import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;

public class CreatePersonIRI extends ConnectDB implements ICreateIRI<Person>{

	public CreatePersonIRI() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Person et, Model model) {
		// TODO Auto-generated method stub
		
		IRI person = f.createIRI(PERSON.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		Literal position = f.createLiteral(et.getPostion());
		
		model.add(person, RDF.TYPE, PERSON);
		model.add(person, LABEL, label);
		model.add(person, DESCRIPTION, description);
		model.add(person, TIME_EXTRACTED, time_extracted);
		model.add(person, LINK, link);
		model.add(person, POSITION, position);
		
		return person;
	}

}
