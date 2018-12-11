package com.ag.database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.impl.TreeModel;

import com.ag.entity.*;
import com.ag.generate.*;
import com.ag.relationship.GenRelationship;
import com.ag.relationship.Relationship;
import com.franz.agraph.repository.AGRepository;

public class AddToDB extends ConnectDB {

	private List<IRI> listIRIEntity;
	private GenRelationship genRel;
	private GenEntity genEn;
	private CreateEntityIRI crEnIRI;
	
	public AddToDB() throws IOException {
		// TODO Auto-generated constructor stub
		listIRIEntity = new ArrayList<>();
		genRel = new GenRelationship();
		genEn = new GenEntity();
		crEnIRI = new CreateEntityIRI();
	}
	
	public void addEntity(int numberOfEntity) throws IOException {
		for(int i=0; i<numberOfEntity; i++) {
			Entity et = genEn.generate();
			listIRIEntity.add(crEnIRI.createIRI(et));
		}
	}
	
	public void addRelationship(int numberOfRelationship) throws IOException {
		for(int i=0; i<numberOfRelationship; i++) {
			IRI ent1 = listIRIEntity.get((int) (Math.random() * listIRIEntity.size() + 0));
			IRI ent2 = listIRIEntity.get((int) (Math.random() * listIRIEntity.size() + 0));
			
			String s = ent1.getLocalName().toLowerCase() + ent2.getLocalName().toLowerCase();
			Relationship rel = genRel.generate(s.replaceAll("\\d", ""));
			
			new CreateRelationshipIRI().createRelationshipIRI(ent1, rel, ent2);
		}
	}
}
