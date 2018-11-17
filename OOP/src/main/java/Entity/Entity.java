package Entity;

import java.util.Date;

public class Entity {
	protected String id;
	protected String description;
	protected Source source;
	private List<String> list_id;
	private List<String> list_description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public Entity( String id, String description, Source source) {
		this.id = id;
		this.description = description;
		this.source = source;
	}
	
}
