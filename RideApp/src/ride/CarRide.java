package ride;

public class CarRide extends Ride {

    
    public int calculateFare(int distance) {
        return distance * 20;
    }

    
    public void rideType() {
        System.out.println("Car Ride");
    }
}