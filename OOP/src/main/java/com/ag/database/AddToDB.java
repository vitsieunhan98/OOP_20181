package com.ag.database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.rdf4j.model.IRI;

import com.ag.entity.*;
import com.ag.generate.*;

public class AddToDB {

	private static int nEntity = 0;
	private static int nRel = 0;
	
	private List<IRI> listIRIEntity;
	private List<Entity> listEntity;
	
	public AddToDB() {
		// TODO Auto-generated constructor stub
		listIRIEntity = new ArrayList<>();
		listEntity = new ArrayList<>();
	}
	
	public void addEntity(int numberOfEntity) throws IOException {
		if(numberOfEntity > nEntity) {
			for(int i=0; i<numberOfEntity - nEntity; i++) {
				Entity et = new GenEntity().generate();
				listEntity.add(et);
				listIRIEntity.add(new CreateEntityIRI().createIRI(et));
			}
		}
		nEntity = numberOfEntity;
	}
	
	public void addRelationship(int numberOfRelationship) throws IOException {
		if(numberOfRelationship > nRel) {
			for(int i=0; i<numberOfRelationship - nRel; i++) {
				int index = (int) (Math.random() * listIRIEntity.size() + 0);
				IRI et1 = listIRIEntity.get(index);
				IRI et2 = listIRIEntity.get(index);
				Entity ent1 = listEntity.get(index);
				Entity ent2 = listEntity.get(index);
				Relationship rel = new GenRelationship().generate(ent1, ent2);
				
				new CreateRelationshipIRI().createRelationshipIRI(et1, rel, et2);
			}
		}
		nRel = numberOfRelationship;
	}
}
