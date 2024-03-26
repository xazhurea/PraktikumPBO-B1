/**
 * Petani.java 
 * Nama : Fathia Rahma
 * NIM : 24060122130082
 * Lab = B1
 * Deskripsi : kelas yang berisi representasi objek Petani
 */

public class Petani {

    //atribut
    protected String NoKTP;
    protected String nama; 
    protected String Kota;
    protected String JenisTani;
    static int counter;
    //constructor

    public Petani(String NoKTP, String Nama, String Kota, String JenisTani){
        this.NoKTP = NoKTP;
        this.nama = Nama;
        this.Kota = Kota;
        this.JenisTani = JenisTani;
        counter++;
    }

    //method lainnya …
    public String GetKota(){
        return Kota ;
    }
    public String GetJenisTani(){
        return JenisTani ;
    } 

    public static int getJmlPetani(){
        return counter;
    }

    public void cetakInfo(){
        System.out.println("PETANI");
        System.out.println("No KTP : " + NoKTP);
        System.out.println("Nama : " + nama);
        System.out.println("Kota : "+ Kota);
        System.out.println("Jenis Tani : " + JenisTani);
        System.out.println();


        
        
    }

}
        