package CodePackage;

public class RegionInstitution implements Institution {

	public void createAnnouncement(String header, String content) {
		Announcement regionAnnouncement=new RegionAnnouncement();
		regionAnnouncement.setContent(content);
		regionAnnouncement.setHeader(header);
		Announcement.regionAnnouncementList.add((RegionAnnouncement)regionAnnouncement);
	}

	public static void sendToAnnouncementsPage() {
		while(Announcement.regionAnnouncementList.size()>0){
			AnnouncementPage.regionAnnouncementList.add(Announcement.regionAnnouncementList.get(0));
			Announcement.regionAnnouncementList.remove(0);
		}
	}

	
}
