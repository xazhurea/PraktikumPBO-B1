public class MPrismaSegitiga {
    public static void main(String[] args){
        Segitiga s = new Segitiga(3,4);
        PrismaSegitiga p = new PrismaSegitiga(s,5);
    
        System.out.println("segitiga(" + s.getAlas() + "," + s.getTinggiSegitiga() + ")" );

        double volume = p.Volume();
        System.out.println("Volume: " + volume);

        double luaspermukaan = p.LuasPermukaan();
        System.out.println("luaspermukaan: " + luaspermukaan);
    }
    
}

