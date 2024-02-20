class Mtitik{
    public static void main(String[] args){
     
        //Deklarasi objek t1 dan t2 dari class Titik
        Titik t1 = new Titik(1,2);
     

        Titik t2 = new Titik(3,4);
    

        Titik t3 = new Titik(5,6);

    
        System.out.println("Jumlah objek titik:" + t1.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
    }

    

} 

