package Entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import ReadFile.ReadFile;

public class Person extends Entity {
	private String postion;
	private String label;
	private List<String> list_position = new ArrayList<String>(new ReadFile().readFile("data"));
	private List<String> list_label = new ArrayList<String>(new ReadFile().readFile("data/personLabel.txt"));
	
	public Person() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String id, String description, Source source, String postion, String label) throws IOException{
		super(id, description, source);
		this.postion = postion;
		this.label = label;
	}
	public String getPostion() {
		return postion;
	}
	
	public void setPostion(String postion) {
		this.postion = postion;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getRandomPosition() {
		Random rd = new Random();
		int index = rd.nextInt(list_position.size());
		return list_position.get(index);
	}
	
	public String getRandomLabel() {
		Random rd = new Random();
		int index = rd.nextInt(list_label.size());
		return list_label.get(index);
	}
}
