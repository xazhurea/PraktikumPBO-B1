
/**
 * File : Senjata.java 05/07/2024
 * Penulis : Fathia Rahma
 * NIM : 24060122130082
 */
package latihanMedium;

public class Senjata{
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata (String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;

    }
    public String getBunyi(){
        return this.bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }

    public boolean isMenusuk(){
        return this.menusuk == true;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}