package shop;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Bill {

    // Method to calculate final amount
    public static double total(int[] price, int[] qty) {

        double amount = 0;

        for (int i = 0; i < price.length; i++) {
            amount = amount + (price[i] * qty[i]);
        }

        if (amount > 500) {
            amount = amount - (amount * 10 / 100);
        }

        return amount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] price = {50, 40, 100, 25, 30};
        int[] qty = new int[5];

        try {

            System.out.println("Available Items:");

            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + " - Rs." + price[i]);

                System.out.print("Enter quantity: ");
                qty[i] = sc.nextInt();
            }

            double finalAmount = total(price, qty);

            System.out.println("\nFinal Amount: Rs." + finalAmount);

            if (finalAmount > 500) {
                System.out.println("10% Discount Applied");
            }

            System.out.println("Purchase Date and Time: "
                    + LocalDateTime.now());

        } catch (Exception e) {

            System.out.println("Invalid input! Please enter numbers only.");

        }

        sc.close();
    }
}