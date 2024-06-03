public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge() {
        this.maxLoad = 20000;
    }

    public double calcFuelEfficiency() {
        return maxLoad / 15; 
    }

    public double calcTripDistance() {
        return maxLoad / 7; 
    }

    public String toString() {
        return "RiverBarge adalah angkutan sungai yang kuat";
    }
}
