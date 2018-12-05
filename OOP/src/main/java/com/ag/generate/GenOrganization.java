package com.ag.generate;

import java.io.IOException;

import com.ag.entity.*;

public class GenOrganization implements IGenerate<Organization>{

	public GenOrganization() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Organization generate() throws IOException {
		return new Organization(new Entity().getRandomId(), new Entity().getRandomDescription(1), new Entity().getRandomSource(), new Organization().getRandomHeadquarter(), new Organization().getRandomLabel());
	}
}
