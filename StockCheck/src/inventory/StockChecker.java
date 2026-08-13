package inventory;

public class StockChecker {

    public static void main(String[] args) {

        // Store stock quantities of 5 items
        int[] stock = {20, 15, 30, 0, 25};

        boolean outOfStock = false;

        // Check each item one by one
        for (int quantity : stock) {

            if (quantity == 0) {
                System.out.println("Out of stock");
                outOfStock = true;
                break;
            }
        }

        // If all items are in stock
        if (!outOfStock) {

            int total = 0;

            // Calculate total quantity
            for (int quantity : stock) {
                total = total + quantity;
            }

            System.out.println("Total Quantity: " + total);

            // Check stock level
            if (total < 50) {
                System.out.println("Low Stock");
            } 
            else if (total <= 100) {
                System.out.println("Moderate Stock");
            } 
            else {
                System.out.println("Good Stock");
            }
        }
    }
}