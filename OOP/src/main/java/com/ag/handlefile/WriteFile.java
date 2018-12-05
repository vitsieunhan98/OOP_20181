package com.ag.handlefile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public WriteFile() {
		// TODO Auto-generated constructor stub
	}
	
	public static void writeFile(String file, String data) throws IOException {
	     File f = new File(file);
	     FileWriter fw = new FileWriter(f);

	     fw.write(data);

	     fw.close();
	}
}
