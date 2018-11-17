package Entity;

import java.util.Date;

public class Person extends Entity {
	private String postion;
	private String label;
	private List<String> list_position;
	private List<String> list_label;
	public Person(String id, String description, Source source, String postion, String label) {
		// TODO Auto-generated constructor stub
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
	
}
