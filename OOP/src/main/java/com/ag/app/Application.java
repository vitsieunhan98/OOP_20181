package com.ag.app;

import java.io.IOException;
import java.util.Scanner;

import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;

import com.ag.database.*;
import com.ag.doquery.DoQuery;
import com.franz.agraph.repository.AGRepositoryConnection;

public class Application {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AddToDB atdb = new AddToDB();
		ConnectDB cdb = new ConnectDB();
		AGRepositoryConnection conn = cdb.connectDB().getConnection();
		
		int[] nentity = {100, 4900, 55000, 340000};
		int[] nrel = {200, 6800, 73000, 420000};
		
		System.out.println("Start generating data");
		
		for (int i = 0; i < nentity.length; i++) {
			atdb.addEntity(nentity[i], atdb.getModel()[i]);
			atdb.addRelationship(nrel[i], atdb.getModel()[i]);
			conn.add(atdb.getModel()[i]);
			DoQuery.doQuery(conn, i);
			
		}
		
		System.out.println("Finish generating data");
		
//		System.out.println("Nhập số câu truy vấn bạn muốn thực hiện (1-20) : ");
//		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
//		if(choice == 1 || choice == 4) {
//			DoQuery.displayResult(conn, DoQuery.getQuery()[choice-1], "description");
//		}
//		else if(choice == 3 || choice == 8) {
//			DoQuery.displayResult(conn, DoQuery.getQuery()[choice-1], "link");
//		}
//		else if(choice == 9 || choice == 19) {
//			DoQuery.displayResult(conn, DoQuery.getQuery()[choice-1], "headquarter");
//		}
//		else {
//			DoQuery.displayResult(conn, DoQuery.getQuery()[choice-1], "label");
//		}
		
	}

}
