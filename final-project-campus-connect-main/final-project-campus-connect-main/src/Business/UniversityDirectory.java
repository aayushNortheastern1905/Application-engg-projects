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
public class UniversityDirectory {
    private ArrayList<University> universityDirectory;
    
    public UniversityDirectory() {
        this.universityDirectory = new ArrayList<University>();
        
        String[] universityNames = {
            "Northeastern University", "Boston University", "Harvard University", "Wentworth Institute Of Technology"
        };
        
        for (int i = 0; i < universityNames.length; i++) {
            University university = new University();
            String universityID = "University-" + (i+1);
            university.setUniversityId(universityID);
            university.setUniversityName(universityNames[i]);
            
            String[] nameParts = universityNames[i].split(" ");
            String username = nameParts[0].toLowerCase();
            university.setUniversityUserName(username);
            
            if(i<2){
                university.setGraduatedStudents("1" + (i) + "3");
                university.setIncomingStudents("2" + (i) + "6");
                university.setOffCampusStudents("3" + (i) + "4");
                university.setOnCampusStudents("4" + (i) + "8");
                
            } else{
                university.setGraduatedStudents("4" + (i) + "3");
                university.setIncomingStudents("3" + (i) + "9");
                university.setOffCampusStudents("2" + (i) + "7");
                university.setOnCampusStudents("1" + (i) + "5");
            }
            
            university.setUniversityPassword(Hashing.encrypt(username, "secretKey"));
            university.setUniversityPhoneNumber("987654321" + (i + 1));
            university.setUniversityEmail("info@" + universityNames[i].replaceAll("\\s", "").toLowerCase() + ".edu");
            universityDirectory.add(university);
        }
        
    }
    
    public ArrayList<University> getUniversityDirectory() {
        return universityDirectory;
    }
    
    public void setUniveristyDirectory(ArrayList<University> university) {
        this.universityDirectory = universityDirectory;
    }
    
    public University addUniversity() {
        University university = new University();
        universityDirectory.add(university);
        return university;
    }
    
    public University universityAuthentication(String username, String password) {
        for(University university : universityDirectory) {
            if(university.getUniversityUserName().equals(username) && university.getUniversityPassword().equals(password)) {
                return university;
            }
        }
        return null;
    }
}
