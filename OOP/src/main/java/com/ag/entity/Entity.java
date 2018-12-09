package com.ag.entity;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.ag.source.Source;

public class Entity {
	protected String id;
	protected String description;
	protected Source source;
	protected String label;
	
	private static int maxId = 1;

	public Entity( String id, String description, Source source, String label) {
		this.id = id;
		this.description = description;
		this.source = source;
		this.label = label;
	}
	
	public String getRandomId() {
		String rs = Integer.toString(maxId);
		maxId++;
		return rs;
	}
	
	public String getRandomDescription(int title) {
		switch (title) {
		case 0:
			return "This is a person";
		case 1:
			return "This is a organization";
		case 2:
			return "This is a location";
		case 3:
			return "This is a event";
		case 4:
			return "This is a country";
		default:
			return null;
		}
	}
	
	public Source getRandomSource() throws IOException {
		return new Source(new Source().getRandomLink(), new Source().getRandomTimeExtracted());
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Source getSource() {
		return source;
	}
	
	public void setSource(Source source) {
		this.source = source;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
