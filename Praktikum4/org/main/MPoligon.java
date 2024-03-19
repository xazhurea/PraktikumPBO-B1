/**
File: MPoligon.java 19/03/2024
* Penulis: Fathia Rahma
* Deskripsi: driver class untuk poligon dan persegi panjang
*/

package org.main;
import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi =  new PersegiPanjang(10,10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas() + "\n");

        Segitiga segitiga =  new Segitiga(4,2, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
    }
}