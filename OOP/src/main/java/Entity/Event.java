package Entity;

import java.util.Date;

public class Event extends Entity {
	private String label;
	private List<String> list_label;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Event(String id, String description, Source source, String label) {
		super(id, description, source);
		this.label = label;
	}

}
