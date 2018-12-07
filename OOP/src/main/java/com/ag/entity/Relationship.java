package com.ag.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.ag.entity.*;
import com.ag.handlefile.*;

public class Relationship {
	private String id;
	private String name;
	private String time;
	private Source source;
	
	private List<String> list_time = new ArrayList<>(new ReadFile().readFile("data/relationship/time.txt"));
	
	private static int maxId = 1;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public Source getSource() {
		return source;
	}
	
	public void setSource(Source source) {
		this.source = source;
	}
	
	public Relationship() throws IOException {
		// TODO Auto-generated constructor stub
	}

	public Relationship(String id, String name, String time, Source source) throws IOException {
		this.id = id;
		this.name = name;
		this.time = time;
		this.source = source;
	}
	
	public String getRandomId() {
		String rs = Integer.toString(maxId);
		maxId++;
		return rs;
	}
	
	public String getRandomTime() {
		Random rd = new Random();
		int index = rd.nextInt(list_time.size());
		return list_time.get(index);
	}
}
