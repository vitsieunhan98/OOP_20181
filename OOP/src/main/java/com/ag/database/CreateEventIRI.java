package com.ag.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import com.ag.entity.Event;
import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;

public class CreateEventIRI extends ConnectDB implements ICreateIRI<Event>{

	public CreateEventIRI() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Event et) {
		// TODO Auto-generated method stub
		
		IRI event = f.createIRI(EVENT.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		
		model.add(event, RDF.TYPE, EVENT);
		model.add(event, LABEL, label);
		model.add(event, DESCRIPTION, description);
		model.add(event, TIME_EXTRACTED, time_extracted);
		model.add(event, LINK, link);
		
		return event;
	}

}
