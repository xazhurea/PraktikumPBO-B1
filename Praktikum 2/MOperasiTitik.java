public class MOperasiTitik {
    public static void main(String[] args){
        Titik t = new Titik(4,4);
        OperasiTitik o = new OperasiTitik();
    
        System.out.println("titik(" + t.getAbsis() + "," + t.getOrdinat() + ")" );
    
        //o.refleksiSumbuX(t);      //tidak bisa dipakai karena privat
        o.refleksiX(t);
        System.out.println("refleksiSumbuX: titik(" + t.getAbsis() + "," + t.getOrdinat() + ")" );
        
        //o.refleksiSumbuY(t);      //tidak bisa dipakai karena privat
        o.refleksiY(t);
        System.out.println("refleksiSumbuY: titik(" + t.getAbsis() + "," + t.getOrdinat() + ")" );
    }
    
}
