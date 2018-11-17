package Entity;

import java.util.Date;

public class Source {
	private String link;
	private Date time_extracted;
	private List<String> list_link;
	private List<Date> list_time_extracted;
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Date getTime_extracted() {
		return time_extracted;
	}
	public void setTime_extracted(Date time_extracted) {
		this.time_extracted = time_extracted;
	}
	public Source(String link, Date time_extracted) {
		this.link = link;
		this.time_extracted = time_extracted;
	}
}
