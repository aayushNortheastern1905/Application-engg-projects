/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author admin
 */
public class Professor {
    private String professorID;
    private String professorName;
    private String professorUserName;
    private String professorPassword;
    private String professorPhoneNumber;
    private String professorEmailID;
//    private String location;
    private CoursesDirectory professorCourseDirectory;

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorUserName() {
        return professorUserName;
    }

    public void setProfessorUserName(String professorUserName) {
        this.professorUserName = professorUserName;
    }

    public String getProfessorPassword() {
        return professorPassword;
    }

    public void setProfessorPassword(String professorPassword) {
        this.professorPassword = professorPassword;
    }

    public String getProfessorPhoneNumber() {
        return professorPhoneNumber;
    }

    public void setProfessorPhoneNumber(String professorPhoneNumber) {
        this.professorPhoneNumber = professorPhoneNumber;
    }

    public String getProfessorEmailID() {
        return professorEmailID;
    }

    public void setProfessorEmailID(String professorEmailID) {
        this.professorEmailID = professorEmailID;
    }

    public CoursesDirectory getProfessorCourseDirectory() {
        return professorCourseDirectory;
    }

    public void setProfessorCourseDirectory(CoursesDirectory professorCourseDirectory) {
        this.professorCourseDirectory = professorCourseDirectory;
    }

    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
    }  
    
}
