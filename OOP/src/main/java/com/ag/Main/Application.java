package com.ag.Main;

import java.io.IOException;

import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;

import com.ag.Database.*;
import com.ag.DoQuery.DoQuery;
import com.franz.agraph.repository.AGRepositoryConnection;

public class Application {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AddToDB atdb = new AddToDB();
		ConnectDB cdb = new ConnectDB();
		AGRepositoryConnection conn = cdb.connectDB().getConnection();
		
		int[] nentity = {100, 5000, 60000, 400000};
		int[] nrel = {200, 7000, 80000, 500000};
		
		System.out.println("Start generating data");
		
		for (int i = 0; i < nentity.length; i++) {
			atdb.addEntity(nentity[i]);
			atdb.addRelationship(nrel[i]);
			
			DoQuery.doQuery(conn, i);
			
		}
		
		System.out.println("Finish generating data");
	}

}
