package com.ag.Entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.ag.ReadFile.ReadFile;

public class Organization extends Entity {
	private String headquarter;
	private String label;
	private List<String> list_headquarter = new ArrayList<String>(new ReadFile().readFile("data/headquarter.txt"));
	private List<String> list_label = new ArrayList<String>(new ReadFile().readFile("data/organizationLabel.txt"));
	
	public Organization() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organization(String id, String description, Source source, String headquarter, String label) throws IOException{
		super(id, description, source);
		this.headquarter = headquarter;
		this.label = label;
	}
	
	public String getHeadquarter() {
		return headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
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
}
