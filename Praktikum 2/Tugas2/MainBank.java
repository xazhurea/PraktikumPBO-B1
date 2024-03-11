public class MainBank {
    public static void main(String[] args){
        BankAccount akun = new BankAccount(1000);

        System.out.println("Saldo sebelum transaksi: " + akun.getBalance());
        akun.deposit(500);
        akun.withdraw(200);
        System.out.println("Saldo sebelum transaksi: " + akun.getBalance());
    }
    
}
