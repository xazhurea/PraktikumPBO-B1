public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " adalah kendaraan yang hebat.";
    }
}