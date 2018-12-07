package com.ag.generate;

import java.io.IOException;

import com.ag.entity.*;

public class GenLocation implements IGenerate<Location>{

	public GenLocation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Location generate() throws IOException {
		Location et = new Location();
		return new Location(et.getRandomId(), et.getRandomDescription(2), et.getRandomSource(), et.getRandomLabel());
	}
}
