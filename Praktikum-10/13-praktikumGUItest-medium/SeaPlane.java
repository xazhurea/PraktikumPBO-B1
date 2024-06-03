
public class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane() {
        this.maxLoad = 5000; 
    }

    public double calcFuelEfficiency() {
        return maxLoad / 8; 
    }

    public double calcTripDistance() {
        return maxLoad / 3; 
    }

    public void takeOff() {
        System.out.println("SeaPlane takes off");
    }

    public void land() {
        System.out.println("SeaPlane lands");
    }

    public void fly() {
        System.out.println("SeaPlane flies");
    }

    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
