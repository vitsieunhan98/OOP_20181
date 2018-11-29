package com.ag.Generate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ag.Relationship.Relationship;
import com.ag.Entity.*;
import com.ag.HandleFile.ReadFile;

public class GenRelationship implements IGenerate<Relationship>{

	private List<String> list_name;
	
	public GenRelationship() {
		// TODO Auto-generated constructor stub
	}

	public String getRandomName() {
		Random rd = new Random();
		int index = rd.nextInt(list_name.size());
		return list_name.get(index);
	}
	
	@Override
	public Relationship generate() throws IOException {
		// TODO Auto-generated method stub
		Entity et1 = new GenEntity().generate();
		Entity et2 = new GenEntity().generate();
		
		list_name = new ArrayList<String>(new ReadFile().readFile("data/relationship/" + et1.getClass().getSimpleName().toLowerCase() + et2.getClass().getSimpleName().toLowerCase() + ".txt"));
		
		return new Relationship(getRandomName(), et1, et2, new Relationship().getRandomTime(), new Entity().getRandomSource());
	}

}
