/**
 * MLingkaran.java 19/03/2024
 * Penulis : Fathia Rahma
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        //menerima input user
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        //lingkaran 1
        System.out.print("Masukkan jejari lingkaran: ");
        double jejari = scan1.nextDouble();

        Lingkaran luas = new Lingkaran(jejari);
        System.out.println("Luas lingkaran 1 dengan jejari "+ jejari +" satuan adalah " + luas.hitungLuas());

        //lingkaran 2
        System.out.print("\nMasukkan jejari lingkaran: ");
        double jejari2 = scan2.nextDouble();

        Lingkaran luas2 = new Lingkaran(jejari2);
        System.out.println("Luas lingkaran 2 dengan jejari "+ jejari2 +" satuan adalah " + luas2.hitungLuas());
        scan1.close();
		scan2.close();

    }    
}
