public class Tester {
    public static void main(String[] args) {
        Car car = new Car(4,4, 15000.00);
        car.showVehicleDetails();
        car.doVehicleSound();
        Boat boat = new Boat(350.90, 700);
        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
