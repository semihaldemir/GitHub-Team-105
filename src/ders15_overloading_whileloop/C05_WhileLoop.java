package ders15_overloading_whileloop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*
        kull toplanmak üzere sayı alın sayıların toplamı 500'e eşit olur
        veya geçerse

        girilen sayı adedi
        girilen sayıların toplamını ve
        "bu kadar yeter" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        double girilensayi=0;
        double toplam=0;
        int sayac=0;

        while (toplam<500){
            System.out.println("toplanmak için sayı giriniz");
            girilensayi= scan.nextDouble();

            toplam+=girilensayi;
            sayac++;
        }

        System.out.println("Girilen "+ sayac+ " sayının toplamı:"+ toplam + " oldu. Bu kadar yeter");


    }
}
