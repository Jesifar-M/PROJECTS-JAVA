package ride;

public abstract class Ride {

    public abstract int calculateFare(int distance);

    public void rideType() {
        System.out.println("Generic Ride");
    }
}