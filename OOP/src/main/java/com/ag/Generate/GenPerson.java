package com.ag.Generate;

import java.io.IOException;

import com.ag.Entity.*;

public class GenPerson implements IGenerate<Person>{

	public GenPerson() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Person generate() throws IOException {
		// TODO Auto-generated method stub
		return new Person(new Entity().getRandomId(), new Entity().getRandomDescription(0), new Entity().getRandomSource(), new Person().getRandomPosition(), new Person().getRandomLabel());
	}
	
}
