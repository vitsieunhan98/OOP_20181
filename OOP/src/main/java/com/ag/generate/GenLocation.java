package com.ag.generate;

import java.io.IOException;

import com.ag.entity.*;

public class GenLocation implements IGenerate<Location>{

	public GenLocation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Location generate() throws IOException {
		return new Location(new Entity().getRandomId(), new Entity().getRandomDescription(2), new Entity().getRandomSource(), new Location().getRandomLabel());
	}
}
