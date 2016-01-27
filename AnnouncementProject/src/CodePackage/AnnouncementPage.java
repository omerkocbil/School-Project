package CodePackage;

import java.util.ArrayList;

public class AnnouncementPage {
	
	static ArrayList<SportAnnouncement> sportAnnouncementList=new ArrayList<SportAnnouncement>();
	static ArrayList<HealthAnnouncement> healthAnnouncementList=new ArrayList<HealthAnnouncement>();
	static ArrayList<RegionAnnouncement> regionAnnouncementList=new ArrayList<RegionAnnouncement>();
	
	
	public void publishAnnouncement(String type,int location) {
		if(type.equals("Sport")){
			System.out.println(sportAnnouncementList.get(location-1).getHeader());
			System.out.println(sportAnnouncementList.get(location-1).getContent());
		}
		else if(type.equals("Health")){
			System.out.println(healthAnnouncementList.get(location-1).getHeader());
			System.out.println(healthAnnouncementList.get(location-1).getContent());
		}
		else if(type.equals("Region")){
			System.out.println(regionAnnouncementList.get(location-1).getHeader());
			System.out.println(regionAnnouncementList.get(location-1).getContent());
		}
		else{
			System.out.println("Please enter \"Sport\" or \"Health\" or \"Region\" ");
		}
	}
	
	public void publishAnnouncementByOneBy(String type) throws InterruptedException {
		if(type.equals("Sport")){
			for(int i=0; i<sportAnnouncementList.size(); i++){
				System.out.println(sportAnnouncementList.get(i).getHeader());
				System.out.println(sportAnnouncementList.get(i).getContent());
				Thread.sleep(5000);
			}
		}
		else if(type.equals("Health")){
			for(int i=0; i<healthAnnouncementList.size(); i++){
				System.out.println(healthAnnouncementList.get(i).getHeader());
				System.out.println(healthAnnouncementList.get(i).getContent());
				Thread.sleep(5000);
			}
		}
		else if(type.equals("Region")){
			for(int i=0; i<regionAnnouncementList.size(); i++){
				System.out.println(regionAnnouncementList.get(i).getHeader());
				System.out.println(regionAnnouncementList.get(i).getContent());
				Thread.sleep(5000);
			}
		}
		else{
			System.out.println("Please enter \"Sport\" or \"Health\" or \"Region\" ");
		}
	}
	
	public void publishAllAnnouncements() {
		for(int i=0; i<sportAnnouncementList.size(); i++){
			System.out.println(sportAnnouncementList.get(i).getHeader());
			System.out.println(sportAnnouncementList.get(i).getContent());
			
		}
		for(int i=0; i<healthAnnouncementList.size(); i++){
			System.out.println(healthAnnouncementList.get(i).getHeader());
			System.out.println(healthAnnouncementList.get(i).getContent());
			
		}
		for(int i=0; i<regionAnnouncementList.size(); i++){
			System.out.println(regionAnnouncementList.get(i).getHeader());
			System.out.println(regionAnnouncementList.get(i).getContent());
			
		}
	}
	
	public void removeAnnouncement() {
		
	}

}
