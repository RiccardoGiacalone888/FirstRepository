class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;
    public Boat(double speed, int weight){
        super("Boat", 0);
        maxKnotsSpeed=speed;
        boatKilosWeight=weight;
    }
    @Override
    public void doVehicleSound(){
        System.out.println("The sound of boat is : splash splash");
    }

    public String getBoatWeightAndSpeed(){
        return "The speed is km/h : " + maxKnotsSpeed + " the weight is kg : " + boatKilosWeight;
    }
}
