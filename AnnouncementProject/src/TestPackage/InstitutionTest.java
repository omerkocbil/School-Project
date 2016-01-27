package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import CodePackage.Announcement;
import CodePackage.HealthAnnouncement;
import CodePackage.HealthInstitution;
import CodePackage.Institution;
import CodePackage.RegionAnnouncement;
import CodePackage.RegionInstitution;
import CodePackage.SportAnnouncement;
import CodePackage.SportInstitution;

public class InstitutionTest {

	@Test
	public void createSportAnnouncementTest() {
		Institution sportInstitution=new SportInstitution();
		sportInstitution.createAnnouncement("Fenerbahçe","Fenerbahçe 82-75 galip");
	}
	
	public void createHealthAnnouncementTest() {
		Institution healthInstitution=new HealthInstitution();
		healthInstitution.createAnnouncement("DSÖ","Dünya Sağlık Örgütü hastalığı açıkladı");
	}
	
	public void createRegionAnnouncementTest() {
		Institution regionInstitution=new RegionInstitution();
		regionInstitution.createAnnouncement("DİB","Diyanet İşleri Başkanlığının hazırladığı takvimler dağıtıldı");
	}
	
	/*public void sendToAnnouncementPageTest(){
		Institution sportInstitution=new SportInstitution();
		Announcement sportAnnouncement=new SportAnnouncement();
		sportInstitution.sendToAnnouncementsPage();
	}*/

}
