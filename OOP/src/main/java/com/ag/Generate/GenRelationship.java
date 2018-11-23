package com.ag.Generate;

import java.io.IOException;

import com.ag.Relationship.Relationship;
import com.ag.Entity.*;

public class GenRelationship implements IGenerate<Relationship>{

	public GenRelationship() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Relationship generate() throws IOException {
		// TODO Auto-generated method stub
		return new Relationship(new Relationship().getRandomName(), new GenEntity().generate(), new GenEntity().generate(), new Relationship().getRandomTime(), new Entity().getRandomSource());
	}

}
