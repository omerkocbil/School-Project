package CodePackage;

public class HealthInstitution implements Institution {
		
	public void createAnnouncement(String header, String content) {
			Announcement healthAnnouncement=new HealthAnnouncement();
			healthAnnouncement.setContent(content);
			healthAnnouncement.setHeader(header);
			Announcement.healthAnnouncementList.add((HealthAnnouncement)healthAnnouncement);
	}

	public static void sendToAnnouncementsPage() {
		while(Announcement.healthAnnouncementList.size()>0){
			AnnouncementPage.healthAnnouncementList.add(Announcement.healthAnnouncementList.get(0));
			Announcement.healthAnnouncementList.remove(0);
		}
	}	

}
