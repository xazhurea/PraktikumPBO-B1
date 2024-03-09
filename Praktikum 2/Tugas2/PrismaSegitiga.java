class PrismaSegitiga{
    // deklarasi atribut
    private Segitiga alas;
    private double tinggiPrisma;

    //deklarasi konstruktor
    public PrismaSegitiga(){
        alas = new Segitiga();
        tinggiPrisma = 0;
    }

    public PrismaSegitiga(Segitiga a, double t){   //overloading constructor
        alas = a;
        tinggiPrisma = t;
    }

    //deklarasi metode
    private double hitungVolume () {
        double volume = alas.hitungLuas() * tinggiPrisma;
        return volume;
        }

    private double hitungLuasPermukaan () {
        double luaspermukaan = alas.hitungLuas()*2 + tinggiPrisma*alas.getAlas()*3;
        return luaspermukaan;
        }
    
    public double Volume () {
        double volume = hitungVolume();
        return volume;
        }        

    public double LuasPermukaan (){
        double luaspermukaan = hitungLuasPermukaan();
        return luaspermukaan;
    }
    

}

