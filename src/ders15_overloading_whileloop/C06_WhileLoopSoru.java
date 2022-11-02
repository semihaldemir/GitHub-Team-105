package ders15_overloading_whileloop;

import java.util.Scanner;

public class C06_WhileLoopSoru {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan sifre isteyin
        asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
 Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre
 yazilinca “sifreniz basari ile kaydedildi” yazdirin
sartlar :
 - sifrenin ilk karakteri kucuk harf olmali
 - sifrenin son karakteri sayi olmali
         */

        Scanner scan=new Scanner(System.in);
        boolean sifreGecerlimi=false;
        String sifre="";
        int bayrak=0;

        while (sifreGecerlimi!=true){
            System.out.println("şifrenizi giriniz");
            sifre= scan.nextLine();
            bayrak=0;


            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("sifrenin ilk karakteri küçük harf olmalı");
                bayrak++;
            }

            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)>='0')){
                System.out.println("şifrenin son karakteri sayı olmalı");
                bayrak++;
            }
            if (sifre.length()<8){
                System.out.println("şifre en az 8 karakter olmalı");
                bayrak++;
            }


            if (bayrak==0){
                sifreGecerlimi=true;
                System.out.println("şifreniz başarı ile kaydedildi");
            }

        }


    }
}
