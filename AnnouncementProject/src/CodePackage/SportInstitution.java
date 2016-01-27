package CodePackage;

public class SportInstitution implements Institution {

	public void createAnnouncement(String header, String content) {
		Announcement sportAnnouncement=new SportAnnouncement();
		sportAnnouncement.setContent(content);
		sportAnnouncement.setHeader(header);
		Announcement.sportAnnouncementList.add((SportAnnouncement)sportAnnouncement);
	}

	public static void sendToAnnouncementsPage() {
		while(Announcement.sportAnnouncementList.size()>0){
			AnnouncementPage.sportAnnouncementList.add(Announcement.sportAnnouncementList.get(0));
			Announcement.sportAnnouncementList.remove(0);
		}
	}

	

}
