package ders31_inheritance;

public class FToyota extends EAraba{

    FToyota(){
        System.out.println("Toyota constructor'ı çalıştı" );
    }

    protected String marka="Toyota";
    protected String motor="Toyota araçlar çevreci motor kullanır";
    protected String uretimYeri="uretim yeri belirtilmemiş";
    protected int hiz=140;

}
