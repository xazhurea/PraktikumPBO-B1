/**
 * PNS.java 
 * Nama : Fathia Rahma
 * NIM : 24060122130082
 * Lab = B1
 * Deskripsi : kelas yang membuat inplementasi metode abstrak pada pajak
 */
public class PNS extends Pajak2{

    //atribut
    protected String NoKTP;
    protected String nama; 
    protected String NIP;
    protected Departemen D1;
    static int counter;
    //constructor

    public PNS(String NoKTP, String Nama, String NPWP, double Tarif, String NIP, Departemen Departemen){
        this.NoKTP = NoKTP;
        this.nama = Nama;
        this.NPWP = NPWP;
        this.Tarif = Tarif;
        this.NIP = NIP;
        this.D1 = Departemen;
        counter++;
    }

    //method lainnya …
    public String GetNIP(){
        return NIP ;
    }

    public double hitungPajak(){
        Pajak = Tarif*D1.getGaji();
        return Pajak;
    }

    public static int getJmlPNS(){
        return counter;
    }

    public void cetakInfo(){
        System.out.println("PNS");
        System.out.println("No KTP : " + NoKTP);
        System.out.println("Nama : " + nama);
        System.out.println("NPWP : " + NPWP);
        System.out.println("Tarif : " + Tarif);
        System.out.println("Pajak : " + getPajak());
        System.out.println("NIP : "+ NIP);
        System.out.println("Departemen : " + D1.getnamaD());
        System.out.println("GajiPokok : " + D1.getGaji());
        System.out.println();


        
        
    }

}
        