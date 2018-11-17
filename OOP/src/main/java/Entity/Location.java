package Entity;

import java.util.Date;

public class Location extends Entity {
	private String label;
	public void setLabel(String label){
		this.label = label;
	}
	public String getLabel(){
		return label;
	}
	private List<String> list_label;
	public Location(String id, String description, Source source, String label) {
		super(id, description, source);
		this.label = label;
		// TODO Auto-generated constructor stub
	}

}
