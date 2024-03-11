public class BankAccount {
        // deklarasi atribut
        private float balance;
    
        //deklarasi konstruktor
        public BankAccount(){
            balance = 0;
        }
        public BankAccount (float initialBalance){   //overloading constructor
            balance = initialBalance;
        }

        //deklarasi metode
        public void deposit(float jumlah){
            balance+=jumlah;
            System.out.println("Deposit sejumlah: " + jumlah + " berhasil. Saldo saat ini: " + balance);
        }
        public void withdraw (float jumlah){
            if (jumlah <=balance){
                balance -=jumlah;
                System.out.println("Penarikan sejumlah: " + jumlah + " berhasil. Saldo saat ini: " + balance);
            }
            else{
                System.out.println("Saldo tidak mencukupi untuk melakukan penarikan sejumlah " + jumlah);
            }
        }

        public float getBalance () {
            return balance;
        }
    
    }
    
