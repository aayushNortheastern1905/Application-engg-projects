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
public class EmployerDirectory {
    private ArrayList<Employer> employerDirectory;
        
    public EmployerDirectory() {
        this.employerDirectory = new ArrayList<Employer>();
    }
    
    public ArrayList<Employer> getEmployerDirectory() {
        return employerDirectory;
    }

    public void setEmployerDirectory(ArrayList<Employer> employerDirectory) {
        this.employerDirectory = employerDirectory;
    }
    
    public Employer addEmployer() {
       Employer employer = new Employer();
       employerDirectory.add(employer);
       return employer;
   }
    
        public Employer employerAuthentication(String username, String password) {
        for(Employer employer : employerDirectory) {
            if(employer.getEmployerUserName().equals(username) && employer.getEmployerPassword().equals(password)) {
                return employer;
            }
        }
        return null;
    }
    
}
