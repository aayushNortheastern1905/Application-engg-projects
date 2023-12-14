/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Ayush
 */
public class ApplicationDirectory {
       private ArrayList<Application> applicationDirectory;

        public ApplicationDirectory() {
            this.applicationDirectory = new ArrayList<Application>();
        }

        public ArrayList<Application> getApplicationDirectory() {
            return applicationDirectory;
        }

        public void setApplicationDirectory(ArrayList<Application> applicationDirectory) {
            this.applicationDirectory = applicationDirectory;
        }
        
        public Application addApplication(Application application) {
            applicationDirectory.add(application);
            return application;
        }
        
}
