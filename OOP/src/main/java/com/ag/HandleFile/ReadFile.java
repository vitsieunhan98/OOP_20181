package com.ag.HandleFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public ReadFile() {
		// TODO Auto-generated constructor stub
	}

	public List<String> readFile(String path) throws IOException {
		List<String> result = new ArrayList<String>();
		BufferedReader bfr = new BufferedReader(new FileReader(path));
		
		String line = bfr.readLine();
		while(line!=null) {
			result.add(line);
			line = bfr.readLine();
		}
		
		bfr.close();
		
		return result;
	}
}
