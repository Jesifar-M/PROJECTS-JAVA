package ride;

public class AutoRide extends Ride {

    
    public int calculateFare(int distance) {
        return distance * 10;
    }

   
    public void rideType() {
        System.out.println("Auto Ride");
    }
}