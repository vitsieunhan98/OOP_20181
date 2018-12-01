package com.ag.DoQuery;

import java.io.IOException;

import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;

import com.ag.HandleFile.WriteFile;
import com.franz.agraph.repository.AGRepositoryConnection;

public class DoQuery {
	
	public DoQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void doQuery1(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy description của thực thể có nhãn Jann Jacko
		String q = "select ?description"
				+ "where {"
				+ "?s oop:description ?description ."
				+ "?s oop:label \"Jann Jacko\" ."
				+ "}";
		
		countTime(conn, q, 1, title);
	}
	
	public static void doQuery2(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy định danh thực thể loại Person và có quan hệ manage với Org có nhãn Food and Agriculture Organization
		//(Ai điều hành tổ chức ... )
		String q = "select ?s"
				+ "where {"
				+ "?s ?rel ?o ."
				+ "?s rdf:type oop:Person ."
				+ "?o oop:label \"Food and Agriculture Organization\" ."
				+ "?rel oop:name ?name ."
				+ "FILTER(regex(str(?name), \"manage\", \"i\"))"
				+ "}";
		
		countTime(conn, q, 2, title);
	}
	
	public static void doQuery3(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy link của thực thể định danh oop:Entity2 (2)
		String q = "select ?link"
				+ "where {"
				+ "oop:Entity2 oop:link ?link ."
				+ "}";
		
		countTime(conn, q, 3, title);
	}
	
	public static void doQuery4(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy nhãn của thực thể định danh oop:Entity5 (5)
		String q = "select ?label"
				+ "where {"
				+ "oop:Entity5 oop:label ?label ."
				+ "}";
		
		countTime(conn, q, 4, title);
	}
	
	public static void doQuery5(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy type của thực thể định danh 22
		String q = "select ?type"
				+ "where {"
				+ "oop:Entity22 rdf:type ?type ."
				+ "}";
		
		countTime(conn, q, 5, title);
	}
	
	public static void doQuery6(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy nhãn của thực thể loại Country có quan hệ hold với thực thể có nhãn Space Trip (Nước nào tổ chức Space Trip)
		String q = "select ?label"
				+ "where {"
				+ "?s ?rel ?o. "
				+ "?o rdf:type oop:Country ."
				+ "?o oop:label ?label ."
				+ "?s oop:label \"Space Trip\" ."
				+ "?rel oop:name ?name ."
				+ "FILTER(regex(str(?name), \"hold\", \"i\")) ."
				+ "}";
		
		countTime(conn, q, 6, title);
	}
	
	public static void doQuery7(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy nhãn của thực thể loại Country, mà thực thể có nhãn Renae Ratledge, position Dentists có quan hệ have
		//Lấy Country mà Renae Ratledge làm Dentists sống
		String q = "select ?label"
				+ "where {"
				+ "?s ?rel ?o ."
				+ "?o rdf:type oop:Country ."
				+ "?s oop:label \"Renae Ratledge\" ."
				+ "?s oop:position \"Dentists\""
				+ "?o oop:label ?label ."
				+ "?rel oop:name ?name"
				+ "FILTER(regex(str(?name), \"have\", \"i\"))"
				+ "}";
		
		countTime(conn, q, 7, title);
	}
	
	public static void doQuery8(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy link của thực thể Location đc trích rút vào Nov. 10, 1990
		String q = "select ?link"
				+ "where {"
				+ "?s oop:link ?link ."
				+ "?s rdf:type oop:Location ."
				+ "?s oop:time_extracted \"Nov. 10, 1990\" ."
				+ "}";
		
		countTime(conn, q , 8, title);
	}
	
	public static void doQuery9(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy trụ sở của thực thể có nhãn
		String q = "select ?headquarter"
				+ "where {"
				+ "?s rdf:type oop:Organization ."
				+ "?s oop:label \"Belgium–Luxembourg Economic Union\" ."
				+ "}";
		
		countTime(conn, q, 9, title);
	}
	
	public static void doQuery10(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy nhãn thực thể Country có World Trade Organization (WTO)
		String q = "select ?label"
				+ "where {"
				+ "?s ?rel ?o ."
				+ "?rel oop:name ?name ."
				+ "?s rdf:type oop:Country ."
				+ "?s oop:label ?label ."
				+ "?o oop:label \"World Trade Organization (WTO)\" ."
				+ "FILTER(regex(str(?name), \"have\", \"i\"))"
				+ "}";
		
		countTime(conn, q, 10, title);
	}
	
	public static void doQuery11(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy nhãn của các thực thể loại Event được tổ chức ở South Park Church
		String q = "select ?label"
				+ "where {"
				+ "?s ?rel ?o ."
				+ "?rel oop:name ?name"
				+ "?s oop:label ?label ."
				+ "?s rdf:type oop:Event ."
				+ "?o oop:label \"South Park Church\" ."
				+ "FILTER(regex(str(?name), \"hold in\", \"i\"))"
				+ "}";
		
		countTime(conn, q, 11, title);
	}
	
	public static void doQuery12(AGRepositoryConnection conn, String title) throws IOException {
		//Lấy nhãn của Country mà person có nhãn Genaro Kopacz visit vào năm 2000 
		String q = "select ?label"
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
		
		countTime(conn, q, 12, title);
	}
	
	public static void countTime(AGRepositoryConnection conn ,String query, int id, String title) throws IOException {
		long begin = System.nanoTime();
		TupleQuery tupleQuery = conn.prepareTupleQuery(QueryLanguage.SPARQL, query);
		long delta = (System.nanoTime() - begin);
		new WriteFile().writeFile("result/q" + Integer.toString(id) + "-" + title + ".txt", Long.toString(delta));
	}
	
	
}
