
package registration;

import java.util.Scanner;

public class WelcomeForm {

    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your first name: ");
        String name = sc.nextLine();

        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        
        System.out.println("Welcome, " + name + "!");
        System.out.println("You are " + age + " years old.");

        sc.close();
    }
}
