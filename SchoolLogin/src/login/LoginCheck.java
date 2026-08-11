package login;

import java.util.Scanner;

public class LoginCheck {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter username code: ");
            char username = sc.next().charAt(0);

            System.out.print("Enter password: ");
            int password = sc.nextInt();

            System.out.print("Enter role ID: ");
            int role = sc.nextInt();

            if (username == 'A' && password == 1234 && role == 1)
                System.out.println("Welcome Admin. Full access granted.");

            else if (username == 'S' && password == 1111 && role == 2)
                System.out.println("Welcome Student. Limited access granted.");

            else if (role == 3)
                System.out.println("Welcome Guest. View-only access.");

            else
                System.out.println("Invalid credentials or role.");
        }
    }
}
