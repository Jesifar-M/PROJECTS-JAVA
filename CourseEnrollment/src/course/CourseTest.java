package course;

public class CourseTest {

    public static void main(String[] args) {

        // Object using default constructor
        Course course1 = new Course();

        // Object using parameterized constructor
        Course course2 = new Course("Python Programming", 6);

        System.out.println("Course 1");
        course1.displayDetails();

        Course.CourseMaterial material1 = course1.new CourseMaterial();
        material1.printMaterial();

        System.out.println();

        System.out.println("Course 2");
        course2.displayDetails();

        Course.CourseMaterial material2 = course2.new CourseMaterial();
        material2.printMaterial();

        System.out.println();

        System.out.println("Total Courses: " + Course.courseCount);
    }
}