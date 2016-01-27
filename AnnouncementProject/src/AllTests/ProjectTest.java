package AllTests;

import CodePackage.*;

public class ProjectTest {
	public static void main(String args[]) throws InterruptedException {
		Institution sportInstitution=new SportInstitution();
		sportInstitution.createAnnouncement("Fenerbahçe", "Fenerbahçe 82-75 maçtan galip ayrıldı.");
		sportInstitution.createAnnouncement("Fenerbahçe", "Fenerbahçe 82-75 maçtan galip ayrıldı.");
		SportInstitution.sendToAnnouncementsPage();
		
		Institution healthInstitution=new HealthInstitution();
		healthInstitution.createAnnouncement("DSÖ", "Dünya Sağlık Örgütü hastalığın tanısını koydu.");
		HealthInstitution.sendToAnnouncementsPage();
		
		Institution regionInstitution=new RegionInstitution();
		regionInstitution.createAnnouncement("DİB", "Diyanet İşleri Başkanlığı takvimleri camiilere ulaştırdı.");
		RegionInstitution.sendToAnnouncementsPage();
		
		AnnouncementPage announcementPage=new AnnouncementPage();
		announcementPage.publishAllAnnouncements();
	}
}
