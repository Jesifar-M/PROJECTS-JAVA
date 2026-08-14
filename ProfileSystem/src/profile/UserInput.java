package profile;

import java.util.Scanner;

public class UserInput {

   
    public static String getName() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        return name;
    }
}