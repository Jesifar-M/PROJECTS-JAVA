package sales;

public class SalesTracker {

    public static void main(String[] args) {

        // Sales data: 5 days and 3 products
        int[][] sales = {
            {100, 80, 60},
            {120, 90, 70},
            {110, 100, 80},
            {90, 95, 75},
            {100, 85, 65}
        };

        // Calculate total sales for each product
        for (int product = 0; product < 3; product++) {

            int total = 0;

            for (int day = 0; day < 5; day++) {
                total = total + sales[day][product];
            }

            System.out.print("Product " + (product + 1) + " Total Sales: " + total);

            // Check performance
            if (total >= 500) {
                System.out.println(" - Target Achieved");
            } 
            else if (total >= 300) {
                System.out.println(" - Average Performance");
            } 
            else {
                System.out.println(" - Needs Improvement");
            }
        }
    }
}