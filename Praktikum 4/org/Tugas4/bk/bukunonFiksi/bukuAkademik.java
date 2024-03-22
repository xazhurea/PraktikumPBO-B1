/**
File: bukuAkademik.java 23/03/2024
* Penulis: Fathia Rahma
* Deskripsi: representasi dari objek buku akademik, turunan kelas buku non fiksi
*/

package bk.bukunonFiksi;

public class bukuAkademik extends bukuNonFiksi{

    public bukuAkademik (String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }
}