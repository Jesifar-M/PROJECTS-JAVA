package course;

public class CourseTest {

    public static void main(String[] args) {

        // Creating first course
        Course course1 = new Course("Java Programming", 8, 30);

        // Creating second course
        Course course2 = new Course("Python Programming", 6, 25);

        // Display first course
        System.out.println("Course 1");
        course1.displayDetails();

        System.out.println();

        // Display second course
        System.out.println("Course 2");
        course2.displayDetails();

        System.out.println();

        // Display total students
        System.out.println("Total Students Enrolled: "
                + Course.totalStudents);

        System.out.println();

        // Calling static nested class method
        Course.Platform.showPlatform();
    }
}