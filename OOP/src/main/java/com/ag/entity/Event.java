package com.ag.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.ag.handlefile.ReadFile;

public class Event extends Entity {
	private List<String> list_label = new ArrayList<String>(new ReadFile().readFile("data/event/eventLabel.txt"));
	
	public Event() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(String id, String description, Source source, String label) throws IOException {
		super(id, description, source, label);
	}

	public String getRandomLabel() {
		Random rd = new Random();
		int index = rd.nextInt(list_label.size());
		return list_label.get(index);
	}
}
