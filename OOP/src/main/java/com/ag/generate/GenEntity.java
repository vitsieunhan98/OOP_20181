package com.ag.generate;

import java.io.IOException;

import com.ag.entity.*;

public class GenEntity implements IGenerate<Entity>{
	
	public Entity generate() throws IOException {
		int random = (int) (Math.random() * 5 + 0);
		
		switch (random) {
		case 0:
			return new GenPerson().generate();
		case 1:
			return new GenOrganization().generate();
		case 2:
			return new GenLocation().generate();
		case 3:
			return new GenEvent().generate();
		case 4:
			return new GenCountry().generate();
		default:
			break;
		}
		return null;
	}
	
}
