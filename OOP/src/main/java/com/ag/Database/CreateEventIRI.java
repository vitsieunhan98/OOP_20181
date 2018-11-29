package com.ag.Database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;

import com.ag.Entity.Event;

public class CreateEventIRI extends ConnectDB implements ICreateIRI<Event>{

	public CreateEventIRI() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Event et) {
		// TODO Auto-generated method stub
		AGRepository myRepo = connectDB();
		ValueFactory f = myRepo.getValueFactory();
		
		IRI event = f.createIRI(ENTITY.toString(), et.getId());
		
		Literal label = f.createLiteral(et.getLabel());
		Literal description = f.createLiteral(et.getDescription());
		Literal link = f.createLiteral(et.getSource().getLink());
		Literal time_extracted = f.createLiteral(et.getSource().getTime_extracted());
		
		AGRepositoryConnection conn = myRepo.getConnection();
		
		conn.add(event, RDF.TYPE, EVENT);
		conn.add(event, LABEL, label);
		conn.add(event, DESCRIPTION, description);
		conn.add(event, TIME_EXTRACTED, time_extracted);
		conn.add(event, LINK, link);
		
		return event;
	}

}
