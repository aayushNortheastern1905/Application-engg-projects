/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class AnnouncementDirectory {
     private ArrayList<Announcement> announcementDirectory;

    public AnnouncementDirectory() {
        this.announcementDirectory = new ArrayList<Announcement>();
    }
     
     

    public ArrayList<Announcement> getAnnouncementDirectory() {
        return announcementDirectory;
    }

    public void setAnnouncementDirectory(ArrayList<Announcement> announcementDirectory) {
        this.announcementDirectory = announcementDirectory;
    }
     
      public Announcement addAnnouncement() {
                Announcement announcement = new Announcement();
                announcementDirectory.add(announcement);
                return announcement;
            }

}
