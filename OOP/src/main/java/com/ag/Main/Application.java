package com.ag.Main;

import java.io.IOException;

import com.ag.Database.*;

public class Application {

	public long countTime() {
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AddToDB atdb = new AddToDB();
		int[] nentity = {100, 5000, 60000, 1000000, 15000000};
		int[] nrel = {200, 7000, 80000, 2000000, 17000000};
		
		System.out.println("Start generating data");
		
//		for (int i = 0; i < nentity.length; i++) {
//			atdb.addEntity(nentity[i]);
//			atdb.addRelationship(nrel[i]);
//		}
		
		atdb.addEntity(100);
		atdb.addRelationship(200);
		
		System.out.println("Finish generating data");
	}

}
