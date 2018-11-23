package com.ag.Entity;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Entity {
	protected String id;
	protected String description;
	protected Source source;
	
	private List<String> list_id;
	private List<String> list_description;
	
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
	
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entity( String id, String description, Source source) {
		this.id = id;
		this.description = description;
		this.source = source;
	}
	
	public String getRandomId() {
		return "1";
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
}
