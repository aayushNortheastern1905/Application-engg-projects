/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author sawan
 */
public class ManagementDirectory {
    private ArrayList<Management> managementDirectory;
            private static final String[] managementNames = {
    "Groma", "Boston Harbor Property Management", "Beantown Residential Services"
        };
            
    public ManagementDirectory(){
        this.managementDirectory = new ArrayList<Management>();
                for (int i = 0; i < 3; i++) {
  
            Management management = new Management();
             UUID randomId = UUID.randomUUID();
            String managementID = "Management-" + randomId.toString();
            String[] names = managementNames[i].split(" ");
            management.setManagementID(managementID);
            management.setManagementName(managementNames[i]);
            management.setManagementUserName(names[0].toLowerCase());
            String password = names[0].toLowerCase();
            management.setManagementPassword(Hashing.encrypt(password, "secretKey"));
            management.setManagementPhoneNumber("123456789" + (i + 1));
            management.setManagementEmailID("management" + (names[0]) + "@gmail.com");
            managementDirectory.add(management);
        }
                
                for (Management management : managementDirectory) {
    System.out.println("ID: " + management.getManagementID());
    System.out.println("Name: " + management.getManagementName());
    System.out.println("Username: " + management.getManagementUserName());
    System.out.println("Password: " + management.getManagementPassword()); // This should be replaced with the encrypted password retrieval
    System.out.println("Phone Number: " + management.getManagementPhoneNumber());
    System.out.println("Email: " + management.getManagementEmailID()); // Assuming there is a method to retrieve email in Management class
    System.out.println("------------------------");
}

                
    }

    public ArrayList<Management> getManagementDirectory() {
        return managementDirectory;
    }

    public void setManagementDirectory(ArrayList<Management> managementDirectory) {
        this.managementDirectory = managementDirectory;
    }
    
    public Management addManagement(){
         Management management = new Management();
         managementDirectory.add(management);
         return management;
    }
    
    public Management managementAuthentication(String userName, String password){
        for(Management management: managementDirectory){
            if(management.getManagementUserName().equals(userName) && management.getManagementPassword().equals(password)){
                return management;
            }
            
        }
        return null;
    }
            
}
