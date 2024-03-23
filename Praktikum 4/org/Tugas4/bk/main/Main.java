/**
File: Main.java 23/03/2024
* Penulis: Fathia Rahma
* Deskripsi: driver class untuk buku fiksi dan nonfiksi
*/

package bk.main;
import bk.buku.Buku;
import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Little Women", "Louisa May Alcott", "1868");
        Buku buku2 = new Buku("Percy Jackson", "Rick Riordan", "2005");

        // Membuat objek buku fiksi
        bukuNovel novel = new bukuNovel("Harry Potter", "J.K. Rowling", "2001", "Fantasy", 500, 125000.0);
        bukuFiksi cerpen = new bukuFiksi("Kumpulan Cerpen", "Ahmad Rifai", "2015", "Short Stories", 200, 15000.0);
        
        // Membuat objek buku non-fiksi
        bukuAkademik akademik = new bukuAkademik("Dasar-dasar Pemrograman", "Budi Santoso", "2020", "Computer Science", 400, 50000.0);
        bukuNonFiksi ilmiah = new bukuNonFiksi("Biologi Sel", "Siti Rahmawati", "2018", "Biology", 300, 40000.0);
        

        // Menampilkan informasi buku menggunakan method view()
        System.out.println("------------------------------\n        Informasi Buku:\n------------------------------\n");
        buku1.view();
        buku2.view();
        System.out.println();

        System.out.println("------------------------------\n    Informasi Buku Fiksi:\n------------------------------\n");
        novel.view();
        cerpen.view();
        System.out.println();
        
        System.out.println("------------------------------\n  Informasi Buku Non-Fiksi:\n------------------------------\n");
        akademik.view();
        ilmiah.view();
    }
}
