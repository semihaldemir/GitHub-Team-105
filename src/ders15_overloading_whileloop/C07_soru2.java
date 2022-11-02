package ders15_overloading_whileloop;

public class C07_soru2 {
    public static void main(String[] args) {
        /*
        alınan sayının rakamlar toplamını bulun
         */

        int sayi=1453;

        int birlerbasamagi=0;
        int rakamlartop=0;

        while (sayi!=0){

            birlerbasamagi=sayi%10;
            rakamlartop+=birlerbasamagi;
            sayi/=10;
        }

        System.out.println(rakamlartop);
    }
}
