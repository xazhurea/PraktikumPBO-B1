/**
 * Lingkaran.java 19/03/2024
 * Penulis : Fathia Rahma
 * Deskripsi : Kelas implementaso IArea berupa cara menghitung luas lingkaran
 */


//mengambil konstanta yang ada di kelas
import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
    
}
