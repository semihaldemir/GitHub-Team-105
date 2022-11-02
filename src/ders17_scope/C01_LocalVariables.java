package ders17_scope;

import java.io.FileOutputStream;

public class C01_LocalVariables {
    public static void main(String[] args) {
        // bir methodun içerisinde oluşturulan variable ların scope u
        //içinde oluşturuldukları method'dur
        //o method'un dışından ULAŞILAMAZLAR
        int sayi=10;
        String isim="ramazan";

        //System.out.println(dogrumu);

        for (int i = 0; i < 10; i++) {
            String adres="Ankara";
          //bir loop içerisinde oluşturulan variablelar sadece
            //o loop içerisinde geçerlidir
        }

        //System.out.println(adres);

        double pi;

        //System.out.println(pi);
        //local variablelar değer atanmadan oluşturulabilir ancak KULLANILAMAZ
        //KULL ÖNCE DEĞER ATANMIŞ OLMALIDIR
    }

    public static void method1(){

        //System.out.println(sayi);
        //isim="tugay";

        boolean dogrumu=true;
    }


}
