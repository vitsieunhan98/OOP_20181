package com.ag.generate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.ag.entity.*;
import com.ag.handlefile.ReadFile;

public class GenRelationship {
	
	private ReadFile rf = new ReadFile();
	private List<String> countrycountry = new ArrayList<>(rf.readFile("data/relationship/countrycountry.txt"));
	private List<String> countryevent = new ArrayList<>(rf.readFile("data/relationship/countryevent.txt"));
	private List<String> countrylocation = new ArrayList<>(rf.readFile("data/relationship/countrylocation.txt"));
	private List<String> countryorganization = new ArrayList<>(rf.readFile("data/relationship/countryorganization.txt"));
	private List<String> countryperson = new ArrayList<>(rf.readFile("data/relationship/countryperson.txt"));
	private List<String> eventcountry = new ArrayList<>(rf.readFile("data/relationship/eventcountry.txt"));
	private List<String> eventevent = new ArrayList<>(rf.readFile("data/relationship/eventevent.txt"));
	private List<String> eventlocation = new ArrayList<>(rf.readFile("data/relationship/eventlocation.txt"));
	private List<String> eventorganization = new ArrayList<>(rf.readFile("data/relationship/eventorganization.txt"));
	private List<String> eventperson = new ArrayList<>(rf.readFile("data/relationship/eventperson.txt"));
	private List<String> locationcountry = new ArrayList<>(rf.readFile("data/relationship/locationcountry.txt"));
	private List<String> locationevent = new ArrayList<>(rf.readFile("data/relationship/locationevent.txt"));
	private List<String> locationlocation = new ArrayList<>(rf.readFile("data/relationship/locationlocation.txt"));
	private List<String> locationorganization = new ArrayList<>(rf.readFile("data/relationship/locationorganization.txt"));
	private List<String> locationperson = new ArrayList<>(rf.readFile("data/relationship/locationperson.txt"));
	private List<String> organizationcountry = new ArrayList<>(rf.readFile("data/relationship/organizationcountry.txt"));
	private List<String> organizationevent = new ArrayList<>(rf.readFile("data/relationship/organizationevent.txt"));
	private List<String> organizationlocation = new ArrayList<>(rf.readFile("data/relationship/organizationlocation.txt"));
	private List<String> organizationorganization = new ArrayList<>(rf.readFile("data/relationship/organizationorganization.txt"));
	private List<String> organizationperson = new ArrayList<>(rf.readFile("data/relationship/organizationperson.txt"));
	private List<String> personcountry = new ArrayList<>(rf.readFile("data/relationship/personcountry.txt"));
	private List<String> personevent = new ArrayList<>(rf.readFile("data/relationship/personevent.txt"));
	private List<String> personlocation = new ArrayList<>(rf.readFile("data/relationship/personlocation.txt"));
	private List<String> personorganization = new ArrayList<>(rf.readFile("data/relationship/personorganization.txt"));
	private List<String> personperson = new ArrayList<>(rf.readFile("data/relationship/personperson.txt"));
	private HashMap<String, List<String>> listName = new HashMap<>();
	private List<String> nameList = new ArrayList<>();
	
	public GenRelationship() throws IOException {
		// TODO Auto-generated constructor stub
		listName.put("countryevent", countryevent);
		listName.put("countryperson", countryperson);
		listName.put("eventcountry", eventcountry);
		listName.put("eventevent", eventevent);
		listName.put("eventlocation", eventlocation);
		listName.put("eventorganization", eventorganization);
		listName.put("eventperson", eventperson);
		listName.put("locationevent", locationevent);
		listName.put("locationperson", locationperson);
		listName.put("organizationevent", organizationevent);
		listName.put("organizationperson", organizationperson);
		listName.put("personcountry", personcountry);
		listName.put("personevent", personevent);
		listName.put("personlocation", personlocation);
		listName.put("personorganization", personorganization);
		listName.put("personperson", personperson);
		listName.put("countrycountry", countrycountry);
		listName.put("countrylocation", countrylocation);
		listName.put("countryorganization", countryorganization);
		listName.put("locationcountry", locationcountry);
		listName.put("locationlocation", locationlocation);
		listName.put("locationorganization", locationorganization);
		listName.put("organizationcountry", organizationcountry);
		listName.put("organizationlocation", organizationlocation);
		listName.put("organizationorganization", organizationorganization);
	}
		
	public String getRandomName(List<String> list_name) {
		Random rd = new Random();
		int index = rd.nextInt(list_name.size());
		return list_name.get(index);
	}
	
	public Relationship generate(String flag) throws IOException {
		// TODO Auto-generated method stub		
		Relationship rel = new Relationship();
		String name = getRandomName(listName.get(flag));
		
		return new Relationship(rel.getRandomId(), name, rel.getRandomTime(), new Entity().getRandomSource());
	}

}
