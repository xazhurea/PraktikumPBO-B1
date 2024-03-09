public class MPrismaSegitiga {
    public static void main(String[] args){
        Segitiga s = new Segitiga(3,4);
        PrismaSegitiga p = new PrismaSegitiga(s,5);
    
        System.out.println("segitiga(" + s.getAlas() + "," + s.getTinggiSegitiga() + ")" );

        System.out.println("Volume: " + p.Volume());
        System.out.println("luaspermukaan: " + p.LuasPermukaan());
    }
    
}

