package com.ag.Main;

import java.io.IOException;
import java.util.Scanner;

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
		
//		System.out.println("Start generating data");
//		
//		for (int i = 0; i < nentity.length; i++) {
//			atdb.addEntity(nentity[i]);
//			atdb.addRelationship(nrel[i]);
//			
//			DoQuery.doQuery(conn, i);
//			
//		}
//		
//		System.out.println("Finish generating data");
		
		System.out.println("Nhập số câu truy vấn bạn muốn thực hiện (1-20) : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 0) {
			DoQuery.displayResult(conn, DoQuery.getQuery()[choice-1], "description");
		}
		else if(choice == 2 || choice == 7) {
			DoQuery.displayResult(conn, DoQuery.getQuery()[choice-1], "link");
		}
		else if(choice == 8 || choice == 18) {
			DoQuery.displayResult(conn, DoQuery.getQuery()[choice-1], "headquarter");
		}
		else {
			DoQuery.displayResult(conn, DoQuery.getQuery()[choice-1], "label");
		}
		
	}

}
