package Entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import ReadFile.ReadFile;

public class Event extends Entity {
	private String label;
	private List<String> list_label = new ArrayList<String>(new ReadFile().readFile("data"));
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public Event() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(String id, String description, Source source, String label) throws IOException {
		super(id, description, source);
		this.label = label;
	}

	public String getRandomLabel() {
		Random rd = new Random();
		int index = rd.nextInt(list_label.size());
		return list_label.get(index);
	}
}
