package student;

public class GradeReport {

    public static void main(String[] args) {

        // Store marks of 5 subjects
        int[] marks = {78, 82, 91, 65, 34};

        int total = 0;
        boolean fail = false;

        // Check marks and calculate total
        for (int mark : marks) {

            if (mark < 35) {
                System.out.println("Fail");
                fail = true;
                break;
            }

            total = total + mark;
        }

        
        if (!fail) {

            double average = total / 5.0;

            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

            if (average >= 90-100) {
                System.out.println("Grade: A");
            }
            else if (average >= 75-89) {
                System.out.println("Grade: B");
            }
            else if (average >= 60-74) {
                System.out.println("Grade: C");
            }
            else {
                System.out.println("Grade: D");
            }
        }
    }
}