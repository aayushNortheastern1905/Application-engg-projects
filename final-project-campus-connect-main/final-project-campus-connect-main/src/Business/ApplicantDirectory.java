/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Ayush
 */
public class ApplicantDirectory {
            private ArrayList<Applicant> applicantDirectory;
            
            private static final String[] applicantNames = {
                "Ravi Patel", "Sofia Nguyen", "Javier Rodriguez", "Aisha Khan", "Omar Al-Farsi",
                "Leila Kim", "Diego Hernandez", "Amina Ali", "Mateo Morales", "Zara Gupta"
                };
            
             public ApplicantDirectory() {
                this.applicantDirectory = new ArrayList<Applicant>();
        
                for (int i = 0; i < 10; i++) {
                    Applicant applicant = new Applicant();
                    UUID randomId = UUID.randomUUID();
                    String applicantID = "Applicant-" + randomId.toString();
                    String[] names = applicantNames[i].split(" ");
                    applicant.setApplicantID(applicantID);
                    applicant.setApplicantName(applicantNames[i]);
                    applicant.setApplicantUserName(names[0].toLowerCase());
                    String password = names[0].toLowerCase();
                    applicant.setApplicantPassword(Hashing.encrypt(password, "secretKey"));
                    applicant.setApplicantPhoneNumber("123456789" + (i + 1));
                    applicant.setApplicantEmailID("applicant-" + (names[0]) + "@gmail.com");
                    
                    if(i<5){
                    applicant.setApplicantUniversity("Northeastern University");
                    }else {
                    applicant.setApplicantUniversity("Boston University");
                    }
                    
                    ApplicationDirectory applicationDirectory = new ApplicationDirectory();
                    applicant.setApplicationDirectory(applicationDirectory);
                    
                    applicantDirectory.add(applicant);
                    }
                }
             


            public Applicant addApplicant() {
                Applicant applicant = new Applicant();
                applicantDirectory.add(applicant);
                return applicant;
            }

            public ArrayList<Applicant> getApplicantDirectory() {
                return applicantDirectory;
            }   

            public void setApplicantDirectory(ArrayList<Applicant> applicantDirectory) {
                this.applicantDirectory = applicantDirectory;
            }
    
            public Applicant applicantAuthentication(String username, String password) {
                for(Applicant applicant : applicantDirectory) {
                    if(applicant.getApplicantUserName().equals(username) && applicant.getApplicantPassword().equals(password)) {
                    return applicant;
                    }
                }
            return null;
            }

        
}
