package com.ag.app;

import java.io.IOException;
import java.util.Scanner;

import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.impl.TreeModel;
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
		DoQuery dq = new DoQuery();
		
//		System.out.println("Start generating data");
//		
//		for (int i = 1; i <= 80; i++) {
//			atdb.addEntity(5000);
//			atdb.addRelationship(6250);
//			conn.add(atdb.getModel());
//			atdb.getModel().clear();
//			if(i==1 || i==6 || i==20 || i==80) {
//				dq.doQuery(conn, i);
//			}
//			
//		}
//		conn.close();
//		System.out.println("Finish generating data");
		
		System.out.println("Nhập số câu truy vấn bạn muốn thực hiện (1-30) : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1 || choice == 4) {
			DoQuery.displayResult(conn, dq.getQuery()[choice-1], "description");
		}
		else if(choice == 3 || choice == 8) {
			DoQuery.displayResult(conn, dq.getQuery()[choice-1], "link");
		}
		else if(choice == 9 || choice == 19) {
			DoQuery.displayResult(conn, dq.getQuery()[choice-1], "headquarter");
		}
		else if(choice == 27) {
			DoQuery.display27(conn, dq.getQuery()[choice-1]);
		}
		else if(choice == 30) {
			DoQuery.display30(conn, dq.getQuery()[choice-1]);
		}
		else if(choice > 20 && choice !=27 && choice !=30) {
			DoQuery.displayResult(conn, dq.getQuery()[choice-1], "s");
		}
		else {
			DoQuery.displayResult(conn, dq.getQuery()[choice-1], "label");
		}
		
	}

}
