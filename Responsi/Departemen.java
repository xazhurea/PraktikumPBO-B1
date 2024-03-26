/**
 * Departemen.java
 * Nama : Fathia Rahma
 * NIM : 24060122130082
 * Lab = B1
 * Deskripsi : kelas yang berisi representasi objek departemen
 */
public class Departemen{

    //atribut
    protected String namaD;
    protected double gaji;
    //constructor
    public Departemen(){
        namaD = "";
        gaji = 0;
    }

    public Departemen(String n, double d){
        namaD = n;
        gaji = d;
    }

    //method lainnya …
    public String getnamaD(){
    return namaD;
    }
    public double getGaji(){
    return gaji;
    }
}
        