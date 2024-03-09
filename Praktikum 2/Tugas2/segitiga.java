class Segitiga{
    // deklarasi atribut
    private double alas;
    private double tinggi;

    //deklarasi konstruktor
    public Segitiga(){
        alas = 0;
        tinggi = 0;

    }

    public Segitiga(double a, double t){   //overloading constructor
        alas = a;
        tinggi = t;
    }

    //deklarasi metode
    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas () {
        double luas = alas*tinggi/2;
        return luas;
        }

}

