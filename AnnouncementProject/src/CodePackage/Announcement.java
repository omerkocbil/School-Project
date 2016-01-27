package CodePackage;

import java.util.ArrayList;

public interface Announcement {
	
	ArrayList<SportAnnouncement> sportAnnouncementList=new ArrayList<SportAnnouncement>();
	ArrayList<HealthAnnouncement> healthAnnouncementList=new ArrayList<HealthAnnouncement>();
	ArrayList<RegionAnnouncement> regionAnnouncementList=new ArrayList<RegionAnnouncement>();
	
	void setHeader(String header);

	void setContent(String content);
	
	String getHeader();
	
	String getContent();

}
