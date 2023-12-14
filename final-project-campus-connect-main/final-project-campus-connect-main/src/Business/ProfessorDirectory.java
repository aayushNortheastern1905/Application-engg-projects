/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class ProfessorDirectory {
    private ArrayList<Professor> professorDirectory;
    private static final String[] professorNames = {
        "John Smith", "Alice Johnson", "Bob Davis", "Emily White", "Michael Brown",
        "Olivia Jones", "David Clark", "Sophia Taylor", "James Wilson", "Emma Hall"
    };
    
    public ProfessorDirectory() {
        this.professorDirectory = new ArrayList<Professor>();
        
        for (int i = 0; i < 10; i++) {
            Professor professor = new Professor();
             UUID courseUUID = UUID.randomUUID();
            String professorID = "Professor-" + courseUUID.toString();
            String[] names = professorNames[i].split(" ");
            professor.setProfessorID(professorID);
            professor.setProfessorName(professorNames[i]);
            professor.setProfessorUserName(names[0].toLowerCase());
            String password = names[0].toLowerCase();
            professor.setProfessorPassword(Hashing.encrypt(password, "secretKey"));
            professor.setProfessorPhoneNumber("123456789" + (i + 1));
            professor.setProfessorEmailID("prof" + (i + 1) + "@gmail.com");
            professorDirectory.add(professor);
        }
    }

    public ArrayList<Professor> getProfessorDirectory() {
        return professorDirectory;
    }

    public void setProfessorDirectory(ArrayList<Professor> professorDirectory) {
        this.professorDirectory = professorDirectory;
    }
    
    public Professor addProfessor() {
       Professor professor = new Professor();
       professorDirectory.add(professor);
       return professor;
   }
    
    public Professor professorAuthentication(String username, String password) {
        for(Professor professor : professorDirectory) {
            if(professor.getProfessorUserName().equals(username) && professor.getProfessorPassword().equals(password)) {
                return professor;
            }
        }
        return null;
    }
      
}
