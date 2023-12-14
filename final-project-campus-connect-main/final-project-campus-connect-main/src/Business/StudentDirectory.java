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
public class StudentDirectory {
            private ArrayList<Student> studentDirectory;
                private static final String[] studentNames = {
        "Virat Kohli", "Rohit Sharma", "Kuldeep Yadav", "Jasprit Bumrah", "Suryakumar Yadav", "Mohammed Siraj", "Mohammed Shami",
                "Shreyas Iyer", "Shubhman Gill", "Ravichandran Ashwin"
                };
    
    public StudentDirectory(){
        this.studentDirectory = new ArrayList<Student>();
        
                for (int i = 0; i < 10; i++) {
                     UUID studentUUID = UUID.randomUUID();
            String studentID = "Student-" + studentUUID.toString();
            Student student = new Student();
            String[] names = studentNames[i].split(" ");
            student.setStudentID(studentID);
            student.setStudentName(studentNames[i]);
            student.setStudentUserName(names[0].toLowerCase());
            String password = names[0].toLowerCase();
            student.setStudentPassword(Hashing.encrypt(password, "secretKey"));
            student.setStudentPhoneNumber("123456789" + (i + 1));
            student.setStudentEmailID("student" + (i + 1) + "@gmail.com");
            studentDirectory.add(student);
        }
        
    }

    public ArrayList<Student> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(ArrayList<Student> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }
    
    
    public Student searchStudentByStudentId(String StudentId) {
        for(Student student : studentDirectory) {
            if(student.getStudentID().equals(StudentId)) {
                return student;
            }
        }
        return null;
    }
    
      public Student addStudent() {
       Student student = new Student();
       studentDirectory.add(student);
       return student;
   }
      
         public Student studentAuthentication(String username, String password) {
        for(Student student : studentDirectory) {
            if(student.getStudentUserName().equals(username) && student.getStudentPassword().equals(password)){
                return student;
            }
        }
        return null;
    }
    
         
    
}
