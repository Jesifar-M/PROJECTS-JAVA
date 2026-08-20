package course;

public class Course {

    private String courseName;
    private int duration;
    private int studentsEnrolled;

    // Final variable
    final String creator = "CodeMentor Academy";

    // Static variable
    static int totalStudents = 0;

    // Parameterized constructor
    Course(String courseName, int duration, int studentsEnrolled) {

        this.courseName = courseName;
        this.duration = duration;
        this.studentsEnrolled = studentsEnrolled;

        totalStudents = totalStudents + studentsEnrolled;
    }

    // Display course details
    void displayDetails() {

        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Students Enrolled: " + studentsEnrolled);
        System.out.println("Creator: " + creator);
    }

    // Static nested class
    static class Platform {

        static void showPlatform() {
            System.out.println("Courses are hosted on CodeMentor");
        }
    }
}