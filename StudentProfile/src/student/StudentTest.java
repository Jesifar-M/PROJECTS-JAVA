package student;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Rahul");
        student.setRollNo(101);
        student.setPercentage(85.5);

        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Percentage: " + student.getPercentage());
    }
}