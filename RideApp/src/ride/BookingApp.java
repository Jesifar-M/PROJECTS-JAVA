package ride;

import java.util.Scanner;

public class BookingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ride type (auto/car): ");
        String rideType = scanner.nextLine();

        System.out.print("Enter distance in kilometers: ");
        int distance = scanner.nextInt();

        if (distance <= 0) {
            System.out.println("Distance must be a positive integer.");
            scanner.close();
            return;
        }

        Ride ride;

        if (rideType.equalsIgnoreCase("auto")) {
            ride = new AutoRide();
        } else if (rideType.equalsIgnoreCase("car")) {
            ride = new CarRide();
        } else {
            System.out.println("Invalid ride type.");
            scanner.close();
            return;
        }

        ride.rideType();

        int fare = ride.calculateFare(distance);

        System.out.println("Total Fare: Rs." + fare);

        scanner.close();
    }
}