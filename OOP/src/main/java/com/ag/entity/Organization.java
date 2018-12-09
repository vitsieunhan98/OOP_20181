package com.ag.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.ag.handlefile.ReadFile;
import com.ag.source.Source;

public class Organization extends Entity {
	private String headquarter;
	private List<String> list_headquarter = new ArrayList<String>(new ReadFile().readFile("data/organization/headquarter.txt"));
	private List<String> list_label = new ArrayList<String>(new ReadFile().readFile("data/organization/organizationLabel.txt"));

	public Organization(String id, String description, Source source, String headquarter, String label) throws IOException{
		super(id, description, source, label);
		this.headquarter = headquarter;
	}

	public String getRandomHeadquarter() {
		Random rd = new Random();
		int index = rd.nextInt(list_headquarter.size());
		return list_headquarter.get(index);
	}
	
	public String getRandomLabel() {
		Random rd = new Random();
		int index = rd.nextInt(list_label.size());
		return list_label.get(index);
	}
	
	public String getHeadquarter() {
		return headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}
	
	public Organization() throws IOException {
		// TODO Auto-generated constructor stub
	}
}
