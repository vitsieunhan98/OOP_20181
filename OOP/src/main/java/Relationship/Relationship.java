package Relationship;

import java.util.Date;

public class Relationship {
	private String name;
	private Entity entity1;
	private Entity entity2;
	private Date time;
	private Source source;
	private List<String> list_name;
	private List<Date> list_time_extracted;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entity getEntity1() {
		return entity1;
	}
	public void setEntity1(Entity entity1) {
		this.entity1 = entity1;
	}
	public Entity getEntity2() {
		return entity2;
	}
	public void setEntity2(Entity entity2) {
		this.entity2 = entity2;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public Relationship(String name, Entity entity1, Entity entity2, Date time, Source source){
		this.name = name;
		this.entity1 = entity1;
		this.entity2 = entity2;
		this.time = time;
		this.source = source;
	}
}
