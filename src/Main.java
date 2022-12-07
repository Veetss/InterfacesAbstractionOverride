public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Car panda = new Car(4, 3, 18.050);
        Boat barca = new Boat(30.1,  1000);

        panda.showVehicleDetails();

        barca.getBoatWeightAndSpeed();
    }
}
