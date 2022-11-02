package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_Soru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip,
         Q’ya bastiginda girdigi isimleri bize liste olarak
         dondurecek bir method olusturun.
         */
        System.out.println(listeOlustur());


    }
    public static List<String> listeOlustur (){

        List<String> isimler=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        String girilenisim="";

        while (!girilenisim.equalsIgnoreCase("q")) {
            System.out.println("listeye girmek için isim giriniz"+
                    "\nbitirmek için q ya basın");
            girilenisim= scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);
            }
        }return isimler;
    }
}
