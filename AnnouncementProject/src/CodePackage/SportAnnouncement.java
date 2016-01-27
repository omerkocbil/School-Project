package CodePackage;

public class SportAnnouncement implements Announcement {

	private String header;
	private String content;

	public void setHeader(String header) {
		this.header=header;
	}

	public void setContent(String content) {
		this.content=content;
	}

	public String getHeader() {
		return header;
	}

	public String getContent() {
		return content;
	}

}
