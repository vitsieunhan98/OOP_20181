package com.ag.generate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ag.entity.*;
import com.ag.handlefile.ReadFile;

public class GenRelationship {
	
	public GenRelationship() {
		// TODO Auto-generated constructor stub
	}

	public String getRandomName(List<String> list_name) {
		Random rd = new Random();
		int index = rd.nextInt(list_name.size());
		return list_name.get(index);
	}
	
	public Relationship generate(Entity et1, Entity et2) throws IOException {
		// TODO Auto-generated method stub
		List<String> list_name = new ArrayList<String>(new ReadFile().readFile("data/relationship/" + et1.getClass().getSimpleName().toLowerCase() + et2.getClass().getSimpleName().toLowerCase() + ".txt"));
			
		return new Relationship(new Relationship().getRandomId(), getRandomName(list_name), et1, et2, new Relationship().getRandomTime(), new Entity().getRandomSource());
	}

}
