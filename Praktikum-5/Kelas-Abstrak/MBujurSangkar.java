/**
 * MBujurSangkar.java 19/03/2024
 * Penulis : Fathia Rahma
 * Deskripsi : kelas abstrak. berisi abstraksi bangun datar
 */

import java.util.Scanner;
public class MBujurSangkar {
    public static void main (String[] args){

        //menerima input user
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();

        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+
                            " satuan adalah " + bs.hitungLuas(sisi));
    }
    
}

/*Apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar 
 * maka program pada main tidak berjalan karena BujurSangkar adalah turunan class BangunDatar sehingga definisi metode harus disertai implementasi pada jenis atau turunannya masing-masing
*/