package course;

public class Course {

    // Instance variables
    private String courseName;
    private int duration;

    // Static variable
    static int courseCount = 0;

    // Final variable
    final String trainingCenter = "ABC Training Center";

    // Default constructor
    Course() {
        courseName = "Java Programming";
        duration = 8;
        courseCount++;
    }

    // Parameterized constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
        courseCount++;
    }

    // Display course details
    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Training Center: " + trainingCenter);
    }

    // Non-static inner class
    class CourseMaterial {

        void printMaterial() {
            System.out.println("Materials provided for this course.");
        }
    }
}