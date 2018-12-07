package com.ag.generate;

import java.io.IOException;

import com.ag.entity.*;

public class GenCountry implements IGenerate<Country>{

	public GenCountry() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Country generate() throws IOException {
		Country et = new Country();
		return new Country(et.getRandomId(), et.getRandomDescription(4), et.getRandomSource(), et.getRandomLabel());
	}
}
