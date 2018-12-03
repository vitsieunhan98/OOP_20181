package com.ag.DoQuery;

import java.io.IOException;

import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;

import com.ag.HandleFile.WriteFile;
import com.franz.agraph.repository.AGRepositoryConnection;

public class DoQuery {
	
	private static String q1 = "select ?description"
			+ "where {"
			+ "?s oop:description ?description ."
			+ "?s oop:label \"Jann Jacko\" ."
			+ "}";
	
	private static String q2 = "select ?s"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?s rdf:type oop:Person ."
			+ "?o oop:label \"Food and Agriculture Organization\" ."
			+ "?rel oop:name ?name ."
			+ "FILTER(regex(str(?name), \"manage\", \"i\"))"
			+ "}";
	
	private static String q3 = "select ?link"
			+ "where {"
			+ "oop:Entity2 oop:link ?link ."
			+ "}";
	
	private static String q4 = "select ?label"
			+ "where {"
			+ "oop:Entity5 oop:label ?label ."
			+ "}";
	
	private static String q5 = "select ?type"
			+ "where {"
			+ "oop:Entity22 rdf:type ?type ."
			+ "}";
	
	private static String q6 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o. "
			+ "?o rdf:type oop:Country ."
			+ "?o oop:label ?label ."
			+ "?s oop:label \"Space Trip\" ."
			+ "?rel oop:name ?name ."
			+ "FILTER(regex(str(?name), \"hold\", \"i\")) ."
			+ "}";
	
	private static String q7 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?o rdf:type oop:Country ."
			+ "?s oop:label \"Renae Ratledge\" ."
			+ "?s oop:position \"Dentists\""
			+ "?o oop:label ?label ."
			+ "?rel oop:name ?name"
			+ "FILTER(regex(str(?name), \"have\", \"i\"))"
			+ "}";
	
	private static String q8 = "select ?link"
			+ "where {"
			+ "?s oop:link ?link ."
			+ "?s rdf:type oop:Location ."
			+ "?s oop:time_extracted \"Nov. 10, 1990\" ."
			+ "}";
	
	private static String q9 = "select ?headquarter"
			+ "where {"
			+ "?s rdf:type oop:Organization ."
			+ "?s oop:label \"Belgium–Luxembourg Economic Union\" ."
			+ "}";
	
	private static String q10 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?rel oop:name ?name ."
			+ "?s rdf:type oop:Country ."
			+ "?s oop:label ?label ."
			+ "?o oop:label \"World Trade Organization (WTO)\" ."
			+ "FILTER(regex(str(?name), \"have\", \"i\"))"
			+ "}";
	
	private static String q11 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?rel oop:name ?name"
			+ "?s oop:label ?label ."
			+ "?s rdf:type oop:Event ."
			+ "?o oop:label \"South Park Church\" ."
			+ "FILTER(regex(str(?name), \"hold in\", \"i\"))"
			+ "}";
	
	private static String q12 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?o oop:label ?label ."
			+ "?o rdf:type oop:Country ."
			+ "?s rdf:type oop:Person ."
			+ "?s oop:label \"Genaro Kopacz\" ."
			+ "?rel oop:name ?name ."
			+ "?rel oop:time ?time ."
			+ "FILTER(regex(str(?time), \"2000\") || regex(str(?name), \"visit\", \"i\"))"
			+ "}";
	
	private static String q13 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?s rdf:type oop:Organization ."
			+ "?s oop:label \"Council of Europe (CoE)\" ."
			+ "?o rdf:type oop:Event ."
			+ "?o oop:label ?label ."
			+ "?rel oop:name ?name ."
			+ "?rel oop:time ?time ."
			+ "FILTER(regex(str(?time), \"2009\") || regex(str(?name), \"held\", \"i\"))"
			+ "}";
	
	private static String q14 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?s rdf:type oop:Event ."
			+ "?s oop:label ?label ."
			+ "?o rdf:type oop:Country ."
			+ "?o oop:label \"Finland\" ."
			+ "?rel oop:name ?name ."
			+ "?rel oop:time ?time ."
			+ "FILTER(regex(str(?time), \"2010\") || regex(str(?name), \"held in\", \"i\"))"
			+ "}";
	
	private static String q15 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?s oop:label ?label ."
			+ "?s rdf:type oop:Organization ."
			+ "?o oop:label \"Nordic Council\" ."
			+ "?o rdf:type oop:Organization ."
			+ "?rel oop:name ?name ."
			+ "FILTER(regex(str(?name), \"in the same country\", \"i\")"
			+ "}";
	
	private static String q16 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o . "
			+ "?s rdf:type oop:Person ."
			+ "?s oop:label ?label ."
			+ "?o rdf:type oop:Organization ."
			+ "?o oop:label \"European Science Foundation\" ."
			+ "?rel oop:name ?name ."
			+ "FILTER(regex(str(?name), \"work in\", \"i\"))"
			+ "}";
	
	private static String q17 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?s rdf:type oop:Person ."
			+ "?s oop:label ?label ."
			+ "?s oop:position \"Fashion designers\" ."
			+ "?o rdf:type oop:Country ."
			+ "?o oop:label \"Latvia\" ."
			+ "?rel oop:name ?name ."
			+ "FILTER(regex(str(?name), \"live in\", \"i\"))"
			+ "}";
	
	private static String q18 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?s rdf:type oop:Location ."
			+ "?s oop:label ?label ."
			+ "?o oop:label \"SlaterCarey Mental Hospital\" ."
			+ "?o rdf:type oop:Location ."
			+ "?rel oop:name ?name ."
			+ "FILTER(regex(str(?name), \"in same country with\", \"i\"))"
			+ "}";
	
	private static String q19 = "select ?headquarter"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?s oop:headquarter ?headquarter ."
			+ "?s rdf:type oop:Organization ."
			+ "?o oop:label \"Italy World Food Programme\" ."
			+ "?o rdf:type oop:Organization ."
			+ "?rel oop:name ?name ."
			+ "FILTER(regex(str(?name), \"in the same country\", \"i\")"
			+ "}";
	
	private static String q20 = "select ?label"
			+ "where {"
			+ "?s ?rel ?o ."
			+ "?s rdf:type oop:Event ."
			+ "?s oop:label ?label ."
			+ "?o oop:label \"Prociencia en la Semana Mundial del Espacio\" ."
			+ "?o rdf:type oop:Event ."
			+ "?rel oop:name ?name ."
			+ "?rel oop:time ?time ."
			+ "FILTER(regex(str(?name), \"is held by same organization\", \"i\") || regex(str(?time), \"2005\"))"
			+ "}";
	
	private static String[] query = new String[] {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20};
	
	public DoQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void doQuery(AGRepositoryConnection conn, String title) throws IOException {
		Thread[] thread = new Thread[20];
		for(int i=0; i<20; i++) {
			String a = Integer.toString(i);
			thread[i] = new Thread(a) {
				public void run() {
					int i = Integer.parseInt(a);
					try {
						countTime(conn, query[i], i, title);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}
		
		for(int i=0; i<20; i++) {
			thread[i].run();
		}
	}
	
	public static void countTime(AGRepositoryConnection conn ,String query, int id, String title) throws IOException {
		long begin = System.nanoTime();
		TupleQuery tupleQuery = conn.prepareTupleQuery(QueryLanguage.SPARQL, query);
		long delta = (System.nanoTime() - begin);
		new WriteFile().writeFile("result/q" + Integer.toString(id) + "-" + title + ".txt", Long.toString(delta/1000000));
	}
	
	
}
