public abstract class Vehicle{

    public String type;
    public int numberOfWheels;


    public void showVehicleDetails() {
        System.out.println("This veichle is a " + type + " and have " + numberOfWheels + " number of wheels");
    }

    public abstract void doVehicleSound();
}
