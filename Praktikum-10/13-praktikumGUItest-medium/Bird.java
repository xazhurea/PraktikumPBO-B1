public class Bird extends Animal implements IFlyer {
    public void takeOff() {
        System.out.println("Bird lepas landas");
    }

    public void land() {
        System.out.println("Bird mendarat");
    }

    public void fly() {
        System.out.println("Bird terbang");
    }

    public void buildNest() {
        System.out.println("Bird membangun sarang");
    }

    public void layEggs() {
        System.out.println("Bird sedang bertelur");
    }

    public void eat() {
        System.out.println("Bird makan");
    }
}