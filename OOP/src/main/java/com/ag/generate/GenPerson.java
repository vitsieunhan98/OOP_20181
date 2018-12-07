package com.ag.generate;

import java.io.IOException;

import com.ag.entity.*;

public class GenPerson implements IGenerate<Person>{

	public GenPerson() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Person generate() throws IOException {
		Person et = new Person();
		return new Person(et.getRandomId(), et.getRandomDescription(0), et.getRandomSource(), et.getRandomPosition(), et.getRandomLabel());
	}
	
}
