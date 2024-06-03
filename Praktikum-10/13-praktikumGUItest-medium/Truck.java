
public class Truck extends Vehicle {
    private double maxLoad;

    public Truck() {
        this.maxLoad = 10000; 
    }

    public double calcFuelEfficiency() {
        return maxLoad / 10; 
    }

    public double calcTripDistance() {
        return maxLoad / 5; 
    }

    public String toString() {
        return "Truck adalah angkutan darat yang sangat handal";
    }
}
