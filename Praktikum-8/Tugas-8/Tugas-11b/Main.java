/*
 * Penulis : Fathia Rahma / 24060122130082
 * File : Main.java
 * Deskripsi : main class untuk generic kupu
 */

public class Main {
    public static void main(String[] args) {
        //Kamus
        Ulat K ;
        Data<Kupu> anu;

        //Algoritma
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
        

    }
}
    