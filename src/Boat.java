public class Boat extends Vehicle{

    public double maxKnotsSpeed;
    public int boatKilosWeight;

    public void doVehicleSound() {
        System.out.println("Java boat go swush");
    }

    /**
     *
     * @param maxSpeed
     * @param weight
     */
    public Boat(double maxSpeed, int weight) {
        super.type = "Boat";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public void getBoatWeightAndSpeed() {
        super.showVehicleDetails();
        System.out.println("Knot speed is: " + maxKnotsSpeed + " and the weight is: " + boatKilosWeight + "kg");
    }
}
