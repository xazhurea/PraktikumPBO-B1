public class OperasiTitik {
    private void refleksiSumbuX(Titik titik){       //tidak bisa diakses luar
        titik.setOrdinat(-titik.getOrdinat());
    }    

    private void refleksiSumbuY(Titik titik){       //tidak bisa diakses luar
        titik.setAbsis(-titik.getAbsis());
    }
    
    public Titik refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return titik;
    }

    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}
