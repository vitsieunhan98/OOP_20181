package com.ag.generate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	
	public GenRelationship() throws IOException {
		// TODO Auto-generated constructor stub
	}
	
	public String getRandomName(String flag) {
		Random rd = new Random();
		switch(flag) {
			case "countrycountry":;
				return countrycountry.get(rd.nextInt(countrycountry.size()));
			case "countryevent":
				return countryevent.get(rd.nextInt(countryevent.size()));
			case "countrylocation":
				return countrylocation.get(rd.nextInt(countrylocation.size()));
			case "countryorganization":
				return countryorganization.get(rd.nextInt(countryorganization.size()));
			case "countryperson":
				return countryperson.get(rd.nextInt(countryperson.size()));
			case "eventcountry":
				return eventcountry.get(rd.nextInt(eventcountry.size()));
			case "eventevent":
				return eventevent.get(rd.nextInt(eventevent.size()));
			case "eventlocation":
				return eventlocation.get(rd.nextInt(eventlocation.size()));
			case "eventorganization":
				return eventorganization.get(rd.nextInt(eventorganization.size()));
			case "eventperson":
				return eventperson.get(rd.nextInt(eventperson.size()));
			case "locationcountry":
				return locationcountry.get(rd.nextInt(locationcountry.size()));
			case "locationevent":
				return locationevent.get(rd.nextInt(locationevent.size()));
			case "locationlocation":
				return locationlocation.get(rd.nextInt(locationlocation.size()));
			case "locationorganization":
				return locationorganization.get(rd.nextInt(locationorganization.size()));
			case "locationperson":
				return locationperson.get(rd.nextInt(locationperson.size()));
			case "organizationcountry":
				return organizationcountry.get(rd.nextInt(organizationcountry.size()));
			case "organizationevent":
				return organizationevent.get(rd.nextInt(organizationevent.size()));
			case "organizationlocation":
				return organizationlocation.get(rd.nextInt(organizationlocation.size()));
			case "organizationorganization":
				return organizationorganization.get(rd.nextInt(organizationorganization.size()));
			case "organizationperson":
				return organizationperson.get(rd.nextInt(organizationperson.size()));
			case "personcountry":
				return personcountry.get(rd.nextInt(personcountry.size()));
			case "personevent":
				return personevent.get(rd.nextInt(personevent.size()));
			case "personlocation":
				return personlocation.get(rd.nextInt(personlocation.size()));
			case "personorganization":
				return personorganization.get(rd.nextInt(personorganization.size()));
			case "personperson":
				return personperson.get(rd.nextInt(personperson.size()));
			default:
				return null;
		}
	}
	
	public Relationship generate(String flag) throws IOException {
		// TODO Auto-generated method stub		
		Relationship rel = new Relationship();
		String name = getRandomName(flag);
		
		return new Relationship(rel.getRandomId(), name, rel.getRandomTime(), new Entity().getRandomSource());
	}

}
