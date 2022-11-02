package ders16_doWhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //10 11 12 sayılarını toplayan bir while loop oluşturalım

        int sayi=10;
        int toplam=0;


        do {

            toplam=toplam+sayi;

            sayi++;

        }while (sayi<=12);

        /*
        Do While Loop'un 2 avantajı vardır

        1- Loop body'si en az bir kere çalışır
        2- while bitiş kontrolü loop kadar çalışır. while loop'ta ise 1 fazla çalışır
        3-
         */
    }
}
