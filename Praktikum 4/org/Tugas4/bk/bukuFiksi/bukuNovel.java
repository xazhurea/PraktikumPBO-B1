/**
File: bukuNovel.java 23/03/2024
* Penulis: Fathia Rahma
* Deskripsi: representasi dari objek buku novel, turunan kelas buku fiksi
*/

package bk.bukuFiksi;

public class bukuNovel extends bukuFiksi{

    public bukuNovel (String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }
}