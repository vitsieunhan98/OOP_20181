package com.ag.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.ag.handlefile.ReadFile;
import com.ag.source.Source;

public class Country extends Entity {
	private List<String> list_label = new ArrayList<String>(new ReadFile().readFile("data/country/countryLabel.txt"));
	
	public Country() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String id, String description, Source source, String label) throws IOException {
		super(id, description, source, label);
	}

	public String getRandomLabel() {
		Random rd = new Random();
		int index = rd.nextInt(list_label.size());
		return list_label.get(index);
	}
}
