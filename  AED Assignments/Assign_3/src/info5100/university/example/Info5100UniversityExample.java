/*
 * Main class for the Info5001 University Example application.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 * Main class for the University example.
 */
public class Info5100UniversityExample {

    /**
     * Main method to execute the program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Initialize department and course catalog
        Department department = new Department("Information Systems");
        CourseCatalog courseCatalog = department.getCourseCatalog();
        
        // Create a new course in the catalog
        Course course = courseCatalog.newCourse("App Engineering", "INFO 5100", 4);
        
        // Create a new course schedule for the semester
        CourseSchedule courseSchedule = department.newCourseSchedule("Fall2020");

        // Offer the course in the current schedule and generate seats
        CourseOffer courseOffer = courseSchedule.newCourseOffer("INFO 5100");
        if (courseOffer == null) return;
        courseOffer.generateSeats(10);

        // Create a new person and student profile
        PersonDirectory personDirectory = department.getPersonDirectory();
        Person person = personDirectory.newPerson("0112303");
        StudentDirectory studentDirectory = department.getStudentDirectory();
        StudentProfile student = studentDirectory.newStudentProfile(person);

        // Register student in the course load for the semester
        CourseLoad courseLoad = student.newCourseLoad("Fall2020");
        courseLoad.newSeatAssignment(courseOffer); // Register student in the class

        // Calculate and display total revenue for the semester
        int totalRevenue = department.calculateRevenuesBySemester("Fall2020");
        System.out.print("Total Revenue: " + totalRevenue);
    }
}

