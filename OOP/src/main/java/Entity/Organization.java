package Entity;

import java.util.Date;

public class Organization extends Entity {
	private String headquarter;
	private String label;
	private List<String> list_headquarter;
	private List<String> list_label;
	public Organization(String id, String description, Source source, String headquarter, String label) {
		// TODO Auto-generated constructor stub
		super(id, description, source);
		this.headquarter = headquarter;
		this.label = label;
	}
	public String getHeadquarter() {
		return headquarter;
	}
	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

}
