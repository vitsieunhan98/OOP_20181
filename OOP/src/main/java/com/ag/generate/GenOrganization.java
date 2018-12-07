package com.ag.generate;

import java.io.IOException;

import com.ag.entity.*;

public class GenOrganization implements IGenerate<Organization>{

	public GenOrganization() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Organization generate() throws IOException {
		Organization et = new Organization();
		return new Organization(et.getRandomId(), et.getRandomDescription(1), et.getRandomSource(), et.getRandomHeadquarter(), et.getRandomLabel());
	}
}
