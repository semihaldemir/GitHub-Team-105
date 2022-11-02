package ders14_methodOlusturma;

import java.util.Scanner;

public class C02_StringConcate {
    public static void main(String[] args) {

        //verilen 2 stringi parametre olarak kabul edip bu iki stringi aralarında bir boşluk
        //olan tek bir string olarak main metoda döndüren bir metod oluşrurun

        Scanner scan=new Scanner(System.in);
        System.out.println("2 string girin");
        String str1= scan.next();
        String str2= scan.next();

        System.out.println(birlestirMetodu(str1, str2));
        System.out.println(birlestirMetodu("bu da","oldu"));
    }
    public static String birlestirMetodu(String str1, String str2){

        return str1 + " " + str2;
    }

}
