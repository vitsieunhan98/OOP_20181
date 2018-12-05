package com.ag.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.ag.handlefile.ReadFile;

public class Source {
	private String link;
	private String time_extracted;
	private List<String> list_link = new ArrayList<String>(new ReadFile().readFile("data/source/link.txt"));
	private List<String> list_time_extracted = new ArrayList<String>(new ReadFile().readFile("data/source/timeExtracted.txt"));
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getTime_extracted() {
		return time_extracted;
	}
	
	public void setTime_extracted(String time_extracted) {
		this.time_extracted = time_extracted;
	}
	
	public Source() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Source(String link, String time_extracted) throws IOException {
		this.link = link;
		this.time_extracted = time_extracted;
	}
	
	public String getRandomLink() {
		Random rd = new Random();
		int index = rd.nextInt(list_link.size());
		return list_link.get(index);
	}
	
	public String getRandomTimeExtracted() {
		Random rd = new Random();
		int index = rd.nextInt(list_time_extracted.size());
		return list_time_extracted.get(index);
	}
}
