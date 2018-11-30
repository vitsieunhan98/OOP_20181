package com.ag.Database;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;

import com.franz.agraph.repository.AGCatalog;
import com.franz.agraph.repository.AGRepository;
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
	protected IRI WHEN;
	
	public ConnectDB() {
		super();
		// TODO Auto-generated constructor stub
		setNamespace();
	}

	public static AGRepository connectDB() {
		AGServer sv = new AGServer(SERVER_URL, USERNAME, PASSWORD);
		AGCatalog catalog = sv.getCatalog(CATALOG_ID);
		AGRepository myRepo = catalog.openRepository(REPOSITORY_ID);
		
		return myRepo;
	}
	
	public static void closeDB() {
		
	}
	
	public void setNamespace() {
		AGRepository myRepo = connectDB();
		ValueFactory f = myRepo.getValueFactory();
		
		LABEL = f.createIRI(NAMESPACE, "label");
		DESCRIPTION = f.createIRI(NAMESPACE, "description");
		TIME_EXTRACTED = f.createIRI(NAMESPACE, "time_extracted");
		LINK = f.createIRI(NAMESPACE, "link");
		POSITION = f.createIRI(NAMESPACE, "position");
		HEADQUARTER = f.createIRI(NAMESPACE, "headquarter");
		TIME = f.createIRI(NAMESPACE, "time");
		
		ENTITY = f.createIRI(NAMESPACE, "Entity");
		PERSON = f.createIRI(NAMESPACE, "Person");
		COUNTRY = f.createIRI(NAMESPACE, "Country");
		EVENT = f.createIRI(NAMESPACE, "Event");
		LOCATION = f.createIRI(NAMESPACE, "Location");
		ORGANIZATION = f.createIRI(NAMESPACE, "Organization");
		RELATIONSHIP = f.createIRI(NAMESPACE, "Relationship");
		WHEN = f.createIRI(NAMESPACE, "When");
	}

	public IRI getLABEL() {
		return LABEL;
	}

	public IRI getDESCRIPTION() {
		return DESCRIPTION;
	}

	public IRI getTIME_EXTRACTED() {
		return TIME_EXTRACTED;
	}

	public IRI getLINK() {
		return LINK;
	}

	public IRI getPOSITION() {
		return POSITION;
	}

	public IRI getHEADQUARTER() {
		return HEADQUARTER;
	}

	public IRI getPERSON() {
		return PERSON;
	}

	public IRI getCOUNTRY() {
		return COUNTRY;
	}

	public IRI getEVENT() {
		return EVENT;
	}

	public IRI getLOCATION() {
		return LOCATION;
	}

	public IRI getORGANIZATION() {
		return ORGANIZATION;
	}

	public IRI getRELATIONSHIP() {
		return RELATIONSHIP;
	}

	public IRI getTIME() {
		return TIME;
	}

	public IRI getENTITY() {
		return ENTITY;
	}

	public IRI getWHEN() {
		return WHEN;
	}
	
}
