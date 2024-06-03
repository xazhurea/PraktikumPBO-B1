import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArmadaKendaraan {
    private List<Vehicle> armada = new ArrayList<>();

    public void tambahArmada(Collection<? extends Vehicle> kendaraan) {
        armada.addAll(kendaraan);
    }

    public List<Vehicle> getAllArmada() {
        return new ArrayList<>(armada);
    }
}