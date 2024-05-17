/**
 * Penulis : Fathia Rahma / 24060122130082
 * File : Data.java
 * Deskripsi : kelas konstruksi generic untuk Kupu
 */

public class Data<T> {
    private T isi;

    T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}