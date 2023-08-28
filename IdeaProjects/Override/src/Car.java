class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;
    public Car(int wheels, int doors, double price){
    super("Car",wheels);
    numberOfDoors=doors;
    carPrice=price;
    }
    @Override
    public void showVehicleDetails (){
        super.showVehicleDetails();
        System.out.println("Numbers of doors " + numberOfDoors);
    }
    @Override
    public void doVehicleSound(){
        System.out.println("The car sound is : vroom vroom");
    }
}
