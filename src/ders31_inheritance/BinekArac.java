package ders31_inheritance;

public class BinekArac extends Arac{

    protected String marka="Binek araçların markası vardır";
    protected String model="Binek araçların modeli olur";
    protected int yil=1900;

    protected void hiz(String yakit){
        System.out.println("Binek araçların hızı modele göre değişir");
    }

    protected void teker(){
        System.out.println("binek araçların 4 tekeri olur");
    }

}
