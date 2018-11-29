package com.ag.DoQuery;

import com.ag.Generate.GenEntity;
import com.ag.HandleFile.WriteFile;
import com.franz.agraph.repository.AGRepositoryConnection;

import java.beans.Statement;
import java.io.IOException;

import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.repository.RepositoryResult;

import com.ag.Entity.Entity;

public class DoQuery {
	
	public DoQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void doQuery1(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?description"
				+ "where {"
				+ "oop:Entity1 oop:description ?description ."
				+ "}";
		
		countTime(conn, q, 1, title);
	}
	
	public static void doQuery2(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?o"
				+ "where {"
				+ "oop:Entity1 ?p ?o ."
				+ "FILTER(regex(str(?p), \"describe\", \"i\")"
				+ "}";
		
		countTime(conn, q, 2, title);
	}
	
	public static void doQuery3(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?link"
				+ "where {"
				+ "oop:Entity2 oop:link ?link ."
				+ "}";
		
		countTime(conn, q, 3, title);
	}
	
	public static void doQuery4(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?label"
				+ "where {"
				+ "oop:Entity5 oop:label ?label ."
				+ "}";
		
		countTime(conn, q, 4, title);
	}
	
	public static void doQuery5(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?type"
				+ "where {"
				+ "oop:Entity2 rdf:type ?type ."
				+ "}";
		
		countTime(conn, q, 5, title);
	}
	
	public static void doQuery6(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?entity"
				+ "where {"
				+ "?entity rdf:type person ."
				+ "?entity ?p oop:Entity10 . "
				+ "FILTER(regex(str(?p), \"describe\", \"i\"))"
				+ "}";
		
		countTime(conn, q, 6, title);
	}
	
	public static void doQuery7(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?entity"
				+ "where {"
				+ "?entity rdf:type oop:Person ."
				+ "?entity oop:position \"Dentists\" ."
				+ "?entity ?p oop:Entity10 ."
				+ "FILTER(regex(str(?p), \"face\", \"i\"))"
				+ "}";
		
		countTime(conn, q, 7, title);
	}
	
	public static void doQuery8(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?link"
				+ "where {"
				+ "?s oop:link ?link ."
				+ "?s oop:time_extracted \"Nov. 10, 1990\" ."
				+ "}";
		
		countTime(conn, q , 8, title);
	}
	
	public static void doQuery9(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?headquarter"
				+ "where {"
				+ "?s rdf:type oop:Organization ."
				+ "?s oop:link \"http://www.w3.org/1999/xlink\" ."
				+ "}";
		
		countTime(conn, q, 9, title);
	}
	
	public static void doQuery10(AGRepositoryConnection conn, String title) throws IOException {
		String q = "select ?label"
				+ "where {"
				+ "?s ?p oop:Entity5 ."
				+ "?s oop:label ?label ."
				+ "FILTER(regex(str(?p), \"describe\", \"i\"))"
				+ "}";
		
		countTime(conn, q, 10, title);
	}
	
	public static void countTime(AGRepositoryConnection conn ,String query, int id, String title) throws IOException {
		long begin = System.nanoTime();
		TupleQuery tupleQuery = conn.prepareTupleQuery(QueryLanguage.SPARQL, query);
		long delta = (System.nanoTime() - begin);
		new WriteFile().writeFile("result/q1-" + title + ".txt", Long.toString(delta));
	}
	
	
}
