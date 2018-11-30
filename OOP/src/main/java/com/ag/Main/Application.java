package com.ag.Main;

import java.io.IOException;

import com.ag.Database.*;
import com.ag.DoQuery.DoQuery;
import com.franz.agraph.repository.AGRepositoryConnection;

public class Application {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AddToDB atdb = new AddToDB();
		ConnectDB cdb = new ConnectDB();
		AGRepositoryConnection conn = cdb.connectDB().getConnection();
		
		int[] nentity = {100, 5000, 60000, 700000};
		int[] nrel = {200, 7000, 80000, 1500000};
		
		System.out.println("Start generating data");
		
		for (int i = 0; i < nentity.length; i++) {
			atdb.addEntity(nentity[i]);
			atdb.addRelationship(nrel[i]);
			
			String a = Integer.toString(i);
			
			Thread t1 = new Thread(a) {
				public void run() {
					try {
						DoQuery.doQuery1(conn, a);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			Thread t2 = new Thread(a) {
				public void run() {
					try {
						DoQuery.doQuery2(conn, a);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			Thread t3 = new Thread(a) {
				public void run() {
					try {
						DoQuery.doQuery3(conn, a);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			
			Thread t4 = new Thread(a) {
				public void run() {
					try {
						DoQuery.doQuery4(conn, a);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}
		
		System.out.println("Finish generating data");
	}

}
