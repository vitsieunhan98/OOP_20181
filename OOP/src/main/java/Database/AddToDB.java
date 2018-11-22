package Database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.rdf4j.model.IRI;
import Entity.*;
import Generate.*;
import Relationship.Relationship;

public class AddToDB {

	private List<IRI> list_entity;
	
	public AddToDB() {
		// TODO Auto-generated constructor stub
		list_entity = new ArrayList<>();
	}
	
	public void addEntity(int numberOfEntity) throws IOException {
		for(int i=0; i<numberOfEntity; i++) {
			Entity et = new GenEntity().generate();
			list_entity.add(new CreateEntityIRI().createIRI(et));
		}
	}
	
	public void addRelationship(int numberOfRelationship) throws IOException {
		for(int i=0; i<numberOfRelationship; i++) {
			IRI et1 = list_entity.get((int) (Math.random() * list_entity.size() + 0));
			IRI et2 = list_entity.get((int) (Math.random() * list_entity.size() + 0));
			Relationship rel = new GenRelationship().generate();
			
			new CreateRelationshipIRI().createRelationshipIRI(et1, rel, et2);
		}
	}
}
