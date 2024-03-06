/**
* File: Angkasial.java
* Deskripsi: Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
*
*/
public class AngkaSial {
    
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka (10);
            as.cobaAngka (13);
            as.cobaAngka (12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage ());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/**No 1 
 * Ketika eksepsi terjadi maka program pada baris ke-12 'System.out.println(angka+" bukan angka sial");' 
 * tidak dieksekusi karena program dihentikan dan dialihkan ke AngkaSialException()*/

 /**No 2 
  * Pada baris ke 21 dieksekusi, hal ini karena pada program baris ke-19 yang memanggil method 'as.cobaAngka (13);' 
  * dengan input 13, dan pada method AngkaSial tersebut program masuk kedalam throw new dan terjadi eksepsi 
  * sehingga menjalankan blok catch
  */