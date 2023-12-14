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
public class Student {
    private String studentID;
    private String studentName;
    private String studentUserName;
    private String studentPassword;
    private String studentPhoneNumber;
    private String studentEmailID;
    private boolean certificateRequested;
    private boolean degreegranted;
    private boolean financialAidGranted;
    private boolean financialAidRequested;
    private String financialAidReason;
    private String feedback;
    private String employerOrganization;
    private ArrayList<Course> studentCourseDirectory;

    public boolean isFinancialAidGranted() {
        return financialAidGranted;
    }

    public void setFinancialAidGranted(boolean financialAidGranted) {
        this.financialAidGranted = financialAidGranted;
    }
    public boolean isFinancialAidRequested() {
        return financialAidRequested;
    }

    public void setFinancialAidRequested(boolean financialAidRequested) {
        this.financialAidRequested = financialAidRequested;
    }

    public String getFinancialAidReason() {
        return financialAidReason;
    }

    public void setFinancialAidReason(String financialAidReason) {
        this.financialAidReason = financialAidReason;
    }

    
    
    public boolean isCertificateRequested() {
        return certificateRequested;
    }

    public void setCertificateRequested(boolean certificateRequested) {
        this.certificateRequested = certificateRequested;
    }

    public boolean isDegreegranted() {
        return degreegranted;
    }

    public void setDegreegranted(boolean degreegranted) {
        this.degreegranted = degreegranted;
    }

//    private String Location;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentUserName() {
        return studentUserName;
    }

    public void setStudentUserName(String studentUserName) {
        this.studentUserName = studentUserName;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentEmailID() {
        return studentEmailID;
    }

    public void setStudentEmailID(String studentEmailID) {
        this.studentEmailID = studentEmailID;
    }

    public ArrayList<Course> getStudentCourseDirectory() {
        return studentCourseDirectory;
    }

    public void setStudentCourseDirectory(ArrayList<Course> studentCourseDirectory) {
        this.studentCourseDirectory = studentCourseDirectory;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }
    
    public Course addCourse(Course course) {
        if (studentCourseDirectory == null) {
            studentCourseDirectory = new ArrayList<>();
        }
        studentCourseDirectory.add(course);
        return course;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getEmployerOrganization() {
        return employerOrganization;
    }

    public void setEmployerOrganization(String employerOrganization) {
        this.employerOrganization = employerOrganization;
    }
    
    
    
    
        
}
