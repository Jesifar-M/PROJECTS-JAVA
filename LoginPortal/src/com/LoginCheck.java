package com;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        String defaultUsername = "admin";
        String defaultPassword = "java123";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine().trim();
        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine().trim();
        sc.close();

        if (enteredUsername.equals(defaultUsername) && enteredPassword.equals(defaultPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Access Denied");
        }
    }
}
