package com.ag.Generate;

import java.io.IOException;

import com.ag.Entity.*;

public class GenCountry implements IGenerate<Country>{

	public GenCountry() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Country generate() throws IOException {
		return new Country(new Entity().getRandomId(), new Entity().getRandomDescription(4), new Entity().getRandomSource(), new Country().getRandomLabel());
	}
}
