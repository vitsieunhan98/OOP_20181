package com.ag.Database;

import java.io.IOException;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;

import com.franz.agraph.repository.AGRepository;

import com.ag.Entity.*;
import com.ag.Generate.GenEntity;
import com.ag.Relationship.Relationship;

public class CreateRelationshipIRI extends ConnectDB {

	public CreateRelationshipIRI() {
		// TODO Auto-generated constructor stub
	}

	public void createRelationshipIRI(IRI et1, Relationship rel, IRI et2) {
		// TODO Auto-generated method stub
		AGRepository myRepo = connectDB();
		ValueFactory f = myRepo.getValueFactory();
		RepositoryConnection conn = myRepo.getConnection();
		
		IRI relationship = f.createIRI(RELATIONSHIP.toString(), rel.getId());
		
		Literal name = f.createLiteral(rel.getName());
		Literal time = f.createLiteral(rel.getTime());
		Literal link = f.createLiteral(rel.getSource().getLink());
		Literal time_extracted = f.createLiteral(rel.getSource().getTime_extracted());
		
		conn.add(et1, relationship, et2);
		conn.add(relationship, NAME, name);
		conn.add(relationship, TIME, time);
		conn.add(relationship, LINK, link);
		conn.add(relationship, TIME_EXTRACTED, time_extracted);
	}
	
}
