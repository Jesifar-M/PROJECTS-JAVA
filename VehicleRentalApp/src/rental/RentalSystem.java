package rental;

public class RentalSystem {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.refuel();
        car.stop();

        ElectricScooter scooter = new ElectricScooter();

        scooter.start();
        scooter.stop();
    }
}