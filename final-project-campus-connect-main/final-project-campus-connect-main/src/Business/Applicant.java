/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author Ayush
 * 
 * 
 */

/* Change applicantUniversity to type University  */
/* Add appliedProperty list attribute which will be of type propertyDirectory  */

public class Applicant {
    private String applicantID;
    private String applicantName;
    private String applicantUserName;
    private String applicantPassword;
    private String applicantPhoneNumber;
    private String applicantEmailID;
    private String applicantUniversity;
    private String applicantUniversityId;
    private ApplicationDirectory applicationDirectory;


    public String getApplicantID() {
        return applicantID;
    }

    public void setApplicantID(String applicantID) {
        this.applicantID = applicantID;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantUserName() {
        return applicantUserName;
    }

    public void setApplicantUserName(String applicantUserName) {
        this.applicantUserName = applicantUserName;
    }

    public String getApplicantPassword() {
        return applicantPassword;
    }

    public void setApplicantPassword(String applicantPassword) {
        this.applicantPassword = applicantPassword;
    }

    public String getApplicantPhoneNumber() {
        return applicantPhoneNumber;
    }

    public void setApplicantPhoneNumber(String applicantPhoneNumber) {
        this.applicantPhoneNumber = applicantPhoneNumber;
    }

    public String getApplicantEmailID() {
        return applicantEmailID;
    }

    public void setApplicantEmailID(String applicantEmailID) {
        this.applicantEmailID = applicantEmailID;
    }

    public String getApplicantUniversity() {
        return applicantUniversity;
    }

    public void setApplicantUniversity(String applicantUniversity) {
        this.applicantUniversity = applicantUniversity;
    }
    
    public String getApplicantUniversityId() {
        return applicantUniversityId;
    }

    public void setApplicantUniversityId(String applicantUniversity) {
        this.applicantUniversityId = applicantUniversity;
    }

    public ApplicationDirectory getApplicationDirectory() {
        return applicationDirectory;
    }

    public void setApplicationDirectory(ApplicationDirectory applicationDirectory) {
        this.applicationDirectory = applicationDirectory;
    }
    
    
}
