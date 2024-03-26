/**
 * Pajak2.java
 * Nama : Fathia Rahma
 * NIM : 24060122130082
 * Lab = B1
 * Deskripsi : kelas abstrak. berisi abstraksi pajak
 */

public abstract class Pajak2 {
    //atribut
    protected String NPWP;
    protected double Tarif;
    protected double Pajak; 
    
    
    //constructor
    public Pajak2(){
        NPWP = "";
        Pajak = 0;
        }

    public Pajak2(String NPWP, double Pajak){
    this.NPWP = NPWP;
    this.Pajak = Pajak;
    }
 
    //abstract method
    public String getNPWP(){
        return NPWP;
    }
    public double getPajak(){
        return Pajak;
    }   
    public double getTarif(){
        return Tarif;
    }   

    public abstract double hitungPajak();
}
