/*
 * File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method
 */

 import java.util.HashMap;
 import java.util.Map;
 public class LambdaMap {
    
    public static void main(String[] args){
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122130082","Fafa");
        mahasiswaMap.put("24060122140093","Tera");
        mahasiswaMap.put("24060122140140","zinosaurus naurr");
        mahasiswaMap.put("24060122140174","yelidrink");


        //Lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " - " +nama));
    }   
}
