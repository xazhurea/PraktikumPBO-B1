
public class Superman extends Kryptonian implements IFlyer {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void takeOff() {
        System.out.println(name + " lepas landas");
    }

    @Override
    public void land() {
        System.out.println(name + " mendarat");
    }

    @Override
    public void fly() {
        System.out.println(name + " terbang");
    }

    public void leapBuilding() {
        System.out.println(name + " melompati gedung");
    }

    public void stopBullet() {
        System.out.println(name + " menghentikan peluru");
    }

    @Override
    public void eat() {
        System.out.println(name + " makan");
    }
}