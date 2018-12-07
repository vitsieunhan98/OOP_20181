package com.ag.database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.rdf4j.model.IRI;

import com.ag.entity.*;
import com.ag.generate.*;
import com.franz.agraph.repository.AGRepository;

public class AddToDB extends ConnectDB {

	private List<IRI> listIRIEntity;
	
	public AddToDB() {
		// TODO Auto-generated constructor stub
		listIRIEntity = new ArrayList<>();
	}
	
	public void addEntity(int numberOfEntity) throws IOException {
		GenEntity genEn = new GenEntity();
		CreateEntityIRI crEnIRI = new CreateEntityIRI();
		for(int i=0; i<numberOfEntity; i++) {
			Entity et = genEn.generate();
			listIRIEntity.add(crEnIRI.createIRI(et));
		}
	}
	
	public void addRelationship(int numberOfRelationship) throws IOException {
		GenRelationship genRel = new GenRelationship();
		for(int i=0; i<numberOfRelationship; i++) {
			IRI ent1 = listIRIEntity.get((int) (Math.random() * listIRIEntity.size() + 0));
			IRI ent2 = listIRIEntity.get((int) (Math.random() * listIRIEntity.size() + 0));
			
			Relationship rel = genRel.generate(ent1.getNamespace().toLowerCase() + ent2.getNamespace().toLowerCase());
			
			new CreateRelationshipIRI().createRelationshipIRI(ent1, rel, ent2);
		}
		
	}
}
