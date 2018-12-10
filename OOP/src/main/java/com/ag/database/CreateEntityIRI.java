package com.ag.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;

import com.ag.entity.*;

public class CreateEntityIRI extends ConnectDB implements ICreateIRI<Entity>{

	public CreateEntityIRI() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IRI createIRI(Entity et, Model model) {
		// TODO Auto-generated method stub
		if(et instanceof Person) {
			return new CreatePersonIRI().createIRI((Person) et, model);
		}
		else if(et instanceof Organization) {
			return new CreateOrganizationIRI().createIRI((Organization) et, model);
		}
		else if(et instanceof Event) {
			return new CreateEventIRI().createIRI((Event) et, model);
		}
		else if(et instanceof Location) {
			return new CreateLocationIRI().createIRI((Location) et, model);
		}
		else if(et instanceof Country) {
			return new CreateCountryIRI().createIRI((Country) et, model);
		}
		return null;
	}

}
