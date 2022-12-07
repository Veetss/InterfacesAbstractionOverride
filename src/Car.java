public class Car extends Vehicle {

    public int numberOfDoors;
    public double carPrice;

    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number of doors is: " + this.numberOfDoors);
    }

    public void doVehicleSound() {
        System.out.println("Java car go brr");
    }

    /**
     *
     * @param wheels
     * @param doors
     * @param price
     */
    public Car(int wheels, int doors, double price) {
        super.type = "Car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
}
