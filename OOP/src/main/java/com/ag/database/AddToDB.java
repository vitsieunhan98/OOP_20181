package com.ag.database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.rdf4j.model.IRI;

import com.ag.entity.*;
import com.ag.generate.*;
import com.franz.agraph.repository.AGRepository;

public class AddToDB extends ConnectDB {

	private List<Entity> listEntity;
	
	public AddToDB() {
		// TODO Auto-generated constructor stub
		listEntity = new ArrayList<>();
	}
	
	public void addEntity(int numberOfEntity) throws IOException {
		for(int i=0; i<numberOfEntity; i++) {
			Entity et = new GenEntity().generate();
			listEntity.add(et);
			new CreateEntityIRI().createIRI(et);
		}
	}
	
	public void addRelationship(int numberOfRelationship) throws IOException {
		for(int i=0; i<numberOfRelationship; i++) {
			Entity ent1 = listEntity.get((int) (Math.random() * listEntity.size() + 0));
			Entity ent2 = listEntity.get((int) (Math.random() * listEntity.size() + 0));
			Relationship rel = new GenRelationship().generate(ent1, ent2);
			
			new CreateRelationshipIRI().createRelationshipIRI(f.createIRI(ENTITY.toString(), ent1.getId()), rel, f.createIRI(ENTITY.toString(), ent2.getId()));
		}
		
	}
}
