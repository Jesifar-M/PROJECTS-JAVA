package attendance;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StudentData {

    // Method to calculate average
    public static double average(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return (double) total / marks.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        // Get student details
        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            names[i] = sc.next();

            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();
        }

        // Display student details
        System.out.println("\nStudent Details:");

        for (int i = 0; i < n; i++) {

            System.out.println(names[i] + " - " + marks[i]);

            if (marks[i] < 35) {
                System.out.println("Needs Improvement");
            }
        }

        // Display average
        System.out.println("Average Mark: " + average(marks));

        // Display current date and time
        System.out.println("Date and Time: " + LocalDateTime.now());

        sc.close();
    }
}