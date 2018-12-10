package com.ag.database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.TreeModel;

import com.franz.agraph.repository.AGCatalog;
import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGRepositoryConnection;
import com.franz.agraph.repository.AGServer;

public class ConnectDB {
	private static final String SERVER_URL = "http://localhost:10035";
	private static final String CATALOG_ID = "";
	private static final String REPOSITORY_ID = "oop";
	private static final String USERNAME = "test";
	private static final String PASSWORD = "xyzzy";
	private static final String NAMESPACE = "http://example.org/ag#";
	
	protected IRI LABEL;
	protected IRI DESCRIPTION;
	protected IRI TIME_EXTRACTED;
	protected IRI LINK;
	protected IRI POSITION;
	protected IRI HEADQUARTER;
	protected IRI TIME;
	
	protected IRI ENTITY;
	protected IRI PERSON;
	protected IRI COUNTRY;
	protected IRI EVENT;
	protected IRI LOCATION;
	protected IRI ORGANIZATION;
	protected IRI RELATIONSHIP;
	protected IRI NAME;
	
	protected AGRepository myRepo = connectDB();
	protected ValueFactory f = myRepo.getValueFactory();
	protected static Model model = new TreeModel();
	
	public ConnectDB() {
		// TODO Auto-generated constructor stub
		setNamespace();
		
	}
	
	public static Model getModel() {
		return model;
	}

	public static AGRepository connectDB() {
		AGServer sv = new AGServer(SERVER_URL, USERNAME, PASSWORD);
		AGCatalog catalog = sv.getCatalog(CATALOG_ID);
		AGRepository myRepo = catalog.openRepository(REPOSITORY_ID);
		
		return myRepo;
	}
	
	public void setNamespace() {
		LABEL = f.createIRI(NAMESPACE, "label");
		DESCRIPTION = f.createIRI(NAMESPACE, "description");
		TIME_EXTRACTED = f.createIRI(NAMESPACE, "time_extracted");
		LINK = f.createIRI(NAMESPACE, "link");
		POSITION = f.createIRI(NAMESPACE, "position");
		HEADQUARTER = f.createIRI(NAMESPACE, "headquarter");
		TIME = f.createIRI(NAMESPACE, "time");
		NAME = f.createIRI(NAMESPACE, "name");
		
		ENTITY = f.createIRI(NAMESPACE, "Entity");
		PERSON = f.createIRI(NAMESPACE, "Person");
		COUNTRY = f.createIRI(NAMESPACE, "Country");
		EVENT = f.createIRI(NAMESPACE, "Event");
		LOCATION = f.createIRI(NAMESPACE, "Location");
		ORGANIZATION = f.createIRI(NAMESPACE, "Organization");
		RELATIONSHIP = f.createIRI(NAMESPACE, "Relationship");
	}
	
}
