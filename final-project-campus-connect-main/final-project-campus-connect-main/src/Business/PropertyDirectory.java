/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class PropertyDirectory {
    private ArrayList<Property> propertyDirectory;
    private static final String[] propertyNames = {
    "#3 47A Creighton St",
    "142 Davis Ave #34",
    "3193 Washington St #404",
    "660 Washington St #241",
    "1367 Common Wealth Ave #335",
    "1387 Washington St #206",
    "692 Columbia Rd. #345",
    "180 Brookline Ave, #23",
    "99 Hanock St., #56"
};
    
    private static final String[] propertyAddress = {
    "Creighton St, Jamaica Plain",
    "Davis Ave Brookline",
    "3193 Washington St, Jamaica Plain",
    "660 Washington St, ChinaTown",
    "61367 Common Wealth Ave, Allston",
    "1387 Washington St #206, South End",
    "692 Columbia Rd, Dorchester",
    "180 Brookline Ave, Brookline",
    "99 Hanock St., Cambridge"
    };
            
    private static final String[] pincode = {
    "02130",
    "02445",
    "02130",
    "02111",
    "02134",
    "02118",
    "02125",
    "02115",
    "02139"
    };
    
    private static final String[] intake = {
        "Fall 23",
    "Fall 23",
    "Fall 24",
    "Spring 24",
    "Spring 24",
    "Fall 24",
    "Fall 24",
    "Fall 23",
    "Spring 24"
    };
    
    private static final String[] youtubeUrl = {
    "https://youtu.be/7rh3WbWPDFU",
    "https://www.youtube.com/watch?v=uaNyI24_huM",
    "https://www.youtube.com/watch?v=7Jq_RgeGN6Q",
    "https://www.youtube.com/watch?v=u0DTPvltrrs",
    "https://www.youtube.com/watch?v=ek4lcGHkaXI",
    "https://www.youtube.com/watch?v=bLdEJZrAzho",
    "https://www.youtube.com/watch?v=HyBmhWOcis4",
    "https://www.youtube.com/watch?v=nNzhT--hLhE",
    "https://www.youtube.com/watch?v=EUeZ-3pqL0g"
    };
    
    private static final String[] uniIds = {
    "University-1",
    "University-2",
    "University-3",
    "University-4",
    "University-2",
    "University-3",
    "University-4",
    "University-1",
    "University-2"
};
    
    private static final String[] universityNames = {
        "Northeastern University",
    "Boston University",
    "Harvard University",
    "Wentworth Institute Of Technology",
    "Boston University",
    "Harvard University",
    "Wentworth Institute Of Technology",
    "Northeastern University",
    "Boston University"
    };
    
    private static final String[] universityUserNames = {
        "northeastern",
    "boston",
    "harvard",
    "wentworth",
    "boston",
    "harvard",
    "wentworth",
    "northeastern",
    "boston"
    };
    
    private static final String[] universityPhoneNumber = {
        "9876543211",
    "9876543212",
    "9876543213",
    "9876543214",
    "9876543212",
    "9876543213",
    "9876543214",
    "9876543211",
    "9876543212"
    };
    
    private static final String[] universityEmail = {
        "info@northeasternuniversity.edu",
    "info@bostonuniversity.edu",
    "info@harvarduniversity.edu",
    "info@wentworthinstituteoftechnology.edu",
    "info@bostonuniversity.edu",
    "info@harvarduniversity.edu",
    "info@wentworthinstituteoftechnology.edu",
    "info@northeasternuniversity.edu",
    "info@bostonuniversity.edu"
    };
    
     public static String[] brokerID = {
        "Broker-9b707e4d-376f-4c02-9b85-67abc713346b",
        "Broker-5360c178-8e9c-4d61-aae5-2e9fc5f0efb9",
        "Broker-29e1c791-f6a9-43f9-9ad2-be9f06ef4ad3",
        "Broker-306b1fef-f92b-4e79-9f03-f22af62a3f1c",
        "Broker-781e8d34-d22e-4a75-8324-5596431742f0",
        "Broker-5360c178-8e9c-4d61-aae5-2e9fc5f0efb9",
        "Broker-5360c178-8e9c-4d61-aae5-2e9fc5f0efb9",
        "Broker-5360c178-8e9c-4d61-aae5-2e9fc5f0efb9",
        "Broker-29e1c791-f6a9-43f9-9ad2-be9f06ef4ad3"
    };

    public static String[] brokerName = {
        "Andrew Miller",
        "Daniel Thomas",
        "Grace Robinson",
        "Ethan Lewis",
        "Isabel Martinez",
        "Daniel Thomas",
        "Daniel Thomas",
        "Daniel Thomas",
        "Grace Robinson"
    };

    public static String[] brokerUsername = {
        "andrew",
        "daniel",
        "grace",
        "ethan",
        "isabel",
        "daniel",
        "daniel",
        "daniel",
        "grace"
    };

    public static String[] brokerPhoneNumber = {
        "1234567891",
        "1234567895",
        "1234567894",
        "1234567897",
        "1234567892",
        "1234567895",
        "1234567895",
        "1234567895",
        "1234567894"
    };

    public static String[] brokerEmail = {
        "broker-Andrew@gmail.com",
        "broker-Daniel@gmail.com",
        "broker-Grace@gmail.com",
        "broker-Ethan@gmail.com",
        "broker-Isabel@gmail.com",
        "broker-Daniel@gmail.com",
        "broker-Daniel@gmail.com",
        "broker-Daniel@gmail.com",
        "broker-Grace@gmail.com"
    }; 
    
    public static String[] managementId = {
        "Management-8e09028f-12c1-476a-847d-db1920bb9b6b",
        "Management-35d6473e-ce8a-4c8e-a2fd-59ca7d0338a3",
        "Management-61bd17df-4e2b-4c5b-97c8-c11c419d0e86",
        "Management-35d6473e-ce8a-4c8e-a2fd-59ca7d0338a3",
        "Management-61bd17df-4e2b-4c5b-97c8-c11c419d0e86",
        "Management-8e09028f-12c1-476a-847d-db1920bb9b6b",
        "Management-35d6473e-ce8a-4c8e-a2fd-59ca7d0338a3",
        "Management-8e09028f-12c1-476a-847d-db1920bb9b6b",
        "Management-35d6473e-ce8a-4c8e-a2fd-59ca7d0338a3"
    };
    
    public static String[] managementName = {
        "Groma",
        "Boston Harbor Property Management",
        "Beantown Residential Services",
        "Boston Harbor Property Management",
        "Beantown Residential Services",
        "Groma",
        "Boston Harbor Property Management",
        "Groma",
        "Boston Harbor Property Management"
    };
    
    public static String[] managementUsername = {
        "groma",
        "boston",
        "beantown",
        "boston",
        "beantown",
        "groma",
        "boston",
        "groma",
        "boston"
    };
    
    public static String[] managementPhoneNumber = {
        "1234567891",
        "1234567892",
        "1234567893",
        "1234567892",
        "1234567893",
        "1234567891",
        "1234567892",
        "1234567891",
        "1234567892"
    };
    
    public static String[] managementEmail = {
        "managementGroma@gmail.com",
        "managementBoston@gmail.com",
        "managementBeantown@gmail.com",
        "managementBoston@gmail.com",
        "managementBeantown@gmail.com",
        "managementGroma@gmail.com",
        "managementBoston@gmail.com",
        "managementGroma@gmail.com",
        "managementBoston@gmail.com"
    };
    
    public static String[] ownerIDs = {
        "Owner-1", "Owner-2", "Owner-3", "Owner-4", "Owner-5", "Owner-6", "Owner-4", "Owner-2", "Owner-1"
    };
    
    public static String[] ownerNames = {
        "Brad Pitt", "Matthew Perry", "David", "Michael Scott", "Sheldon Cooper", "Howard Wolovitz", "Michael Scott", "Matthew Perry", "Brad Pitt"
    };
    
    public static String[] ownerUserNames = {
        "brad", "matthew", "david", "michael", "sheldon", "howard",  "michael", "matthew", "brad"
    };
    
    
    public static String[] ownerPhones = {
        "1234567891", "1234567892", "1234567893", "1234567894", "1234567895", "1234567896",  "1234567894", "1234567892", "1234567891"
    };
    
    public static String[] ownerEmails = {
        "owner-Brad@gmail.com",
        "owner-Matthew@gmail.com",
        "owner-David@gmail.com",
        "owner-Michael@gmail.com",
        "owner-Sheldon@gmail.com",
        "owner-Howard@gmail.com",
        "owner-Michael@gmail.com",
        "owner-Matthew@gmail.com",
        "owner-Brad@gmail.com"

    };

    public static String[] carpetArea = {
        "1500 sqft",
        "1800 sqft",
        "2200 sqft",
        "110 sqft",
        "2200 sqft",
        "1500 sqft",
        "1800 sqft",
        "2200 sqft",
        "1800 sqft"

    };

    public PropertyDirectory() {
        this.propertyDirectory = new ArrayList<Property>();
        
        
        for (int i = 0; i < 9; i++) {
            Property property = new Property();
            UUID randomId = UUID.randomUUID();
            String propertyId = "Property-" + randomId.toString();
            property.setPropertyId(propertyId);
            property.setName(propertyNames[i]);
            property.setAddress(propertyAddress[i]);
            property.setIsTaken(false);
            property.setCity("Boston");
            property.setState("Massachusetts");
            property.setYoutubeLink(youtubeUrl[i]);
            property.setPincode(pincode[i]);
            property.setIntake(intake[i]);
                        
            University university = new University();
            university.setUniversityId(uniIds[i]);
            university.setUniversityName(universityNames[i]);
            university.setUniversityUserName(universityUserNames[i]);
            university.setUniversityPhoneNumber(universityPhoneNumber[i]);
            university.setUniversityEmail(universityEmail[i]);
            property.setUniversity(university);
            
            Broker broker = new Broker();
            broker.setBrokerID(brokerID[i]);
            broker.setBrokerName(brokerName[i]);
            broker.setBrokerUserName(brokerUsername[i]);
            broker.setBrokerPhoneNumber(brokerPhoneNumber[i]);
            broker.setBrokerEmailID(brokerEmail[i]);
            property.setBroker(broker);
            
            Management management = new Management();
            management.setManagementID(managementId[i]);
            management.setManagementName(managementName[i]);
            management.setManagementPhoneNumber(managementPhoneNumber[i]);
            management.setManagementEmailID(managementEmail[i]);
            management.setManagementUserName(managementUsername[i]);
            property.setManagement(management);
            property.setCartpetArea(carpetArea[i]);

            property.setIsOwnerApproved(true);
            
            // Populating Owner field in property
            Owner owner = new Owner();
            owner.setOwnerID(ownerIDs[i]);
            owner.setOwnerName(ownerNames[i]);
            owner.setOwnerUserName(ownerUserNames[i]);
            owner.setOwnerPhoneNumber(ownerPhones[i]);
            owner.setOwnerEmailID(ownerEmails[i]);
            property.setOwner(owner);
            
//            Owner o = new Owner();
//            o.setOwnerName("");
//            property.setOwner(o);
            
//            InterestedCustomer interestedCustomer1 = new InterestedCustomer();
//            InterestedCustomerDirectory interestedCustomerDirectory1 = new InterestedCustomerDirectory();
//            interestedCustomer1.setInterestedCustomerID("1");
//            interestedCustomer1.setInterestedCustomerName("Eenu");
//            interestedCustomer1.setInterestedCustomerPhoneNumber("5512298795"); 
//            interestedCustomer1.setNumberOfRoomates("3");
//            interestedCustomer1.setDepositAmount("$3500");
//            interestedCustomerDirectory1.addInterestedCustomer(interestedCustomer1);
//            property.setInterestedCustomerDirectory(interestedCustomerDirectory1);
            
            InterestedCustomerDirectory interestedCustomers = new InterestedCustomerDirectory();
            property.setInterestedCustomerDirectory(interestedCustomers);
            
            propertyDirectory.add(property);
        }
    }

    public ArrayList<Property> getPropertyDirectory() {
        return propertyDirectory;
    }

    public void setPropertyDirectory(ArrayList<Property> propertyDirectory) {
        this.propertyDirectory = propertyDirectory;
    }
    
    public Property addProperty() {
       Property property = new Property();
       propertyDirectory.add(property);
       return property;
   }  
    
    public Property searchPropertyById(String PropertyId) {
        for(Property property : propertyDirectory) {
            if(property.getPropertyId().equals(PropertyId)) {
                return property;
            }
        }
        return null;
    }
    
        public boolean isPropertyRentedTo(String applicationId) {
        for (Property property : propertyDirectory) {
            if (property.isIsTaken() && property.getRentedTo().equals(applicationId)) {
                return true; // Property is rented to the given applicationId
            }
        }
        return false; // No property is rented to the given applicationId
    }
        
        public Property searchPropertyByApplicationId(String applicationId) {
        for (Property property : propertyDirectory) {
            if (property.isIsTaken() && property.getRentedTo().equals(applicationId)) {
                return property; 
            }
        }
        return null; 
    }
    
}
