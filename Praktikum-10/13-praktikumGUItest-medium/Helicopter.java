

public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter() {
        this.maxLoad = 3000; 
    }

    public double calcFuelEfficiency() {
        return maxLoad / 9; 
    }

    public double calcTripDistance() {
        return maxLoad / 4; 
    }

    public void takeOff() {
        System.out.println("Helicopter lepas landas");
    }

    public void land() {
        System.out.println("Helicopter mendarat");
    }

    public void fly() {
        System.out.println("Helicopter terbang");
    }

    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
