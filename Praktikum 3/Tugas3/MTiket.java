/*
 * Pembuat : Fathia Rahma & 24060122130082
 * Tanggal : 9 Maret 2024
 * File : MTiket.java
 * Deskripsi : Program utama untuk memesan tiket dengan memeriksa ketersediaan tiket dan metode pembayaran.
 */

import java.util.Scanner;

public class MTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scanner.nextInt();
        Tiket.pesanJumlahTiket(jumlahTiket);

        System.out.println("Pilih e-wallet yang akan digunakan:");
        System.out.println("1. OVO");
        System.out.println("2. GoPay");
        System.out.println("3. DANA");
        System.out.println("4. LinkAja");
        System.out.print("Pilih e-wallet (1-4): ");
        int EWallet = scanner.nextInt();

        Tiket.isEWallet(EWallet);
    }
}

