package com.ag.Database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.rdf4j.model.IRI;
import com.ag.Entity.*;
import com.ag.Generate.*;
import com.ag.Relationship.Relationship;

public class AddToDB {

	private static int nEntity = 0;
	private static int nRel = 0;
	
	private List<IRI> list_entity;
	
	public AddToDB() {
		// TODO Auto-generated constructor stub
		list_entity = new ArrayList<>();
	}
	
	public void addEntity(int numberOfEntity) throws IOException {
		if(numberOfEntity > nEntity) {
			for(int i=0; i<numberOfEntity - nEntity; i++) {
				Entity et = new GenEntity().generate();
				list_entity.add(new CreateEntityIRI().createIRI(et));
			}
		}
		nEntity = numberOfEntity;
	}
	
	public void addRelationship(int numberOfRelationship) throws IOException {
		if(numberOfRelationship > nRel) {
			for(int i=0; i<numberOfRelationship - nRel; i++) {
				IRI et1 = list_entity.get((int) (Math.random() * list_entity.size() + 0));
				IRI et2 = list_entity.get((int) (Math.random() * list_entity.size() + 0));
				Relationship rel = new GenRelationship().generate();
				
				new CreateRelationshipIRI().createRelationshipIRI(et1, rel, et2);
			}
		}
		nRel = numberOfRelationship;
	}
}
