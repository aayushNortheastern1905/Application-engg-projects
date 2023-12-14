/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class CoursesDirectory {
    private ArrayList<Course> courseDirectory;
    private static final String[] courseNames = {
        "Introduction to Java Programming",
        "Web Development Fundamentals",
        "Database Management",
        "Machine Learning Basics",
        "Artificial Intelligence",
        "Data Structures and Algorithms",
        "Mobile App Development",
        "Cybersecurity Fundamentals",
        "Digital Marketing Strategies",
        "Project Management"
    };
    
    private static final String[] courseDescriptions = {
        "Comprehensive course covering Java programming concepts and practices.",
        "Learn the essentials of web development and HTML, CSS, and JavaScript.",
        "Master the art of managing databases and SQL.",
        "An introduction to the fundamentals of machine learning.",
        "Explore the world of artificial intelligence and its applications.",
        "Study advanced data structures and algorithm design.",
        "Create mobile apps for Android and iOS platforms.",
        "Discover the basics of cybersecurity and protecting digital assets.",
        "Develop effective digital marketing strategies for online success.",
        "Learn project management principles and practices."
    };
    
    private static final String[] regions = {
        "Boston", "New York", "London", "Mumbai", "Pune", "Chennai"
    };

    private static final String[] languages = {
        "English", "French", "Hindi"
    };
    
    
    public CoursesDirectory(ProfessorDirectory professorDirectory) {
        this.courseDirectory = new ArrayList<Course>();
        Random random = new Random();
        DecimalFormat ratingFormat = new DecimalFormat("0.0");
        
        
        ArrayList<Professor> professors = professorDirectory.getProfessorDirectory();
        
        int courseCount = 0;
        for (Professor professor : professors) {
            if (courseCount >= 10) {
                break; 
            }

            Course course = new Course();
            UUID courseUUID = UUID.randomUUID();
            String courseID = "Course-" + courseUUID.toString();
            course.setCourseID(courseID);
            course.setCourseName(courseNames[courseCount]);
            course.setDescription(courseDescriptions[courseCount]);
            course.setProfessor(professor);
            course.setTerm(random.nextBoolean() ? "Fall" : "Spring");
            course.setRegion(regions[random.nextInt(regions.length)]);
            course.setLanguage(languages[random.nextInt(languages.length)]);
            double rawRating = 1.0 + (4.0 * random.nextDouble());
            course.setRating(Double.parseDouble(ratingFormat.format(rawRating)));
            
            DaySchedule mondaySchedule = new DaySchedule("Monday", "1:00pm", "3:00pm");
            DaySchedule wednesdaySchedule = new DaySchedule("Wednesday", "4:00pm", "6:00pm");
            
            course.getSchedule().addDaySchedule(mondaySchedule);
            course.getSchedule().addDaySchedule(wednesdaySchedule);
            
            courseDirectory.add(course);
            courseCount++;
        }
    }

    public ArrayList<Course> getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(ArrayList<Course> courseDirectory) {
        this.courseDirectory = courseDirectory;
    }
    
    public Course addCourse() {
        Course course = new Course();
        courseDirectory.add(course);
        return course;
    }
    
    public Course searchCourseByCourseName(String courseName) {
        for(Course course : courseDirectory) {
            if(course.getCourseName().equals(courseName)) {
                return course;
            }
        }
        return null;
    }
    
    public Course searchCourseByProfessorName(String professorName) {
        for(Course course : courseDirectory) {
            if(course.getProfessor().getProfessorName().equals(professorName)) {
                return course;
            }
        }
        return null;
    }
    
    public Course searchCourseByCourseID(String courseID) {
        for(Course course : courseDirectory) {
            if(course.getCourseID().equals(courseID)) {
                return course;
            }
        }
        return null;
    }
    
    public Course searchCourseByRegion(String region) {
        for(Course course : courseDirectory) {
            if(course.getRegion().equals(region)) {
                return course;
            }
        }
    return null;
    }
    
    public Course searchCourseByLanguage(String language) {
        for(Course course : courseDirectory) {
            if(course.getLanguage().equals(language)) {
                return course;
            }
        }
        return null;
    }    
}
