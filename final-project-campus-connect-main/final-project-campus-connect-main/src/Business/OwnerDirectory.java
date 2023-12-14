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
public class OwnerDirectory {
        private ArrayList<Owner> ownerDirectory;
                private static final String[] ownerNames = {
                "Brad Pitt", "Matthew Perry", "David", "Michael Scott", "Sheldon Cooper","Howard Wolovitz"
                };

                public OwnerDirectory (){
    
                    this.ownerDirectory = new ArrayList<Owner>();
                                    for (int i = 0; i < 6; i++) {
                  
                    Owner owner = new Owner();
                    UUID randomId = UUID.randomUUID();
                    String ownerID = "Owner-" + (i+1);
                    String[] names = ownerNames[i].split(" ");
                    owner.setOwnerID(ownerID);

                   owner.setOwnerName(ownerNames[i]);

                    owner.setOwnerUserName(names[0].toLowerCase());
                    String password = names[0].toLowerCase();
                  
                    owner.setOwnerPassword(Hashing.encrypt(password,"secretKey"));
                   owner.setOwnerPhoneNumber("123456789" + (i+1));
                   owner.setOwnerEmailID("owner-" + (names[0] + "@gmail.com"));
                     System.out.println(owner.getOwnerPassword());
                    ownerDirectory.add(owner);
                    }
                                    
                                            for (Owner owner : ownerDirectory) {
            System.out.println("Owner ID: " + owner.getOwnerID());
            System.out.println("Owner Name: " + owner.getOwnerName());
            System.out.println("Owner User Name: " + owner.getOwnerUserName());
            System.out.println("Owner Phone: " + owner.getOwnerPhoneNumber());
            System.out.println("Owner Password: " + owner.getOwnerPassword());
            System.out.println("Owner Email: " + owner.getOwnerEmailID());

            System.out.println("----------------------------------------");
        }
                }
    public ArrayList<Owner> getOwnerDirectory() {
        return ownerDirectory;
    }

    public void setOwnerDirectory(ArrayList<Owner> ownerDirectory) {
        this.ownerDirectory = ownerDirectory;
    }
    
                
               public Owner addOwner(){
                    Owner owner = new Owner();
                    ownerDirectory.add(owner);
                    return owner;
                }
               

                 
                 public Owner ownerAuthentication (String userName, String password){
                     for (Owner owner : ownerDirectory){
                         if(owner.getOwnerUserName().equals(userName) && owner.getOwnerPassword().equals(password)){
                             return owner;
                         }
                     }
                     return null;
                 }
}
