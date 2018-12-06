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
	private Entity entity1;
	private Entity entity2;
	private String time;
	private Source source;
	private List<String> list_time = new ArrayList<String>(new ReadFile().readFile("data/relationship/time.txt"));
	
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
	
	public Entity getEntity1() {
		return entity1;
	}
	
	public void setEntity1(Entity entity1) {
		this.entity1 = entity1;
	}
	
	public Entity getEntity2() {
		return entity2;
	}
	
	public void setEntity2(Entity entity2) {
		this.entity2 = entity2;
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

	public Relationship(String id, String name, Entity entity1, Entity entity2, String time, Source source) throws IOException {
		this.id = id;
		this.name = name;
		this.entity1 = entity1;
		this.entity2 = entity2;
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
