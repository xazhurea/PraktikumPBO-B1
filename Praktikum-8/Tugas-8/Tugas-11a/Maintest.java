/*
 * Penulis : Fathia Rahma / 24060122130082
 * File : Maintest.java
 * Deskripsi : main class untuk generic kupu
 */

public class Maintest {
    public static void main(String[] args) {
        //Kamus
        Ulat K ;
        Data<Kupu> anu;

        //Algoritma
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}
