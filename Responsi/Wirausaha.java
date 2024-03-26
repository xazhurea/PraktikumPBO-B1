/**
 * Wirausaha.java 
 * Nama : Fathia Rahma
 * NIM : 24060122130082
 * Lab = B1
 * Deskripsi : kelas yang membuat inplementasi metode abstrak pada pajak
 */

public class Wirausaha extends Pajak2{

    //atribut
    protected String NoKTP;
    protected String nama; 
    protected String SIUP;
    protected double Omset;
    static int counter;
    //constructor

    public Wirausaha(String NoKTP, String Nama, String NPWP, double Tarif, String SIUP, double Omset){
        this.NoKTP = NoKTP;
        this.nama = Nama;
        this.NPWP = NPWP;
        this.Tarif = Tarif;
        this.SIUP = SIUP;
        this.Omset = Omset;
        counter++;
    }

    //method lainnya …
    public String GetSIUP(){
        return SIUP ;
    }
    public double GetOmset(){
        return Omset ;
    } 

    public double hitungPajak(){
        Pajak = Tarif*Omset;
        return Pajak;
    }

    public static int getJmlWirausaha(){
        return counter;
    }

    public void cetakInfo(){
        System.out.println("WIRAUSAHA");
        System.out.println("No KTP : " + NoKTP);
        System.out.println("Nama : " + nama);
        System.out.println("NPWP : " + NPWP);
        System.out.println("Tarif : " + Tarif);
        System.out.println("Pajak : " + getPajak());
        System.out.println("SIUP : "+ SIUP);
        System.out.println("Omset : " + Omset);
        System.out.println();


        
        
    }

}
        