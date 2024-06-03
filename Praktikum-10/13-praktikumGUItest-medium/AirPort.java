public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Izin diberikan untuk mendarat";
        } else {
            return "Izin ditolak. Hanya pesawat yang diizinkan untuk mendarat.";
        }
    }
}