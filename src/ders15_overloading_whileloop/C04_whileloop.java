package ders15_overloading_whileloop;

import java.util.Scanner;

public class C04_whileloop {
    public static void main(String[] args) {

        /*
        kull tamsayılar alın
        kullanıcı 0'a basarsa sayı alma işlemini bitirin
        kullanıcının kaç sayı girdiğini
        ve bu sayılarının toplamını yazdırın
         */

        Scanner scan=new Scanner(System.in);
        int girilenSayi=5;  //verilen ilk değer bu soru için 0 olmamalı.
                            // çünkü 0 loop'u bitirmek için kullanılacak
        int sayac=0;
        int toplam=0;

        while (girilenSayi != 0){
        System.out.println("lutfen toplamak için tamsayıgirin" +
                "\nbitirmek için sıfıra basın");
            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){
                sayac++;
                toplam=toplam+girilenSayi;
            }
        }
        System.out.println("girilen "+ sayac + " adet sayının toplamı: "+toplam);



    }
}
