package ders08_turnery_switch;

import java.util.Scanner;

public class C01_Turnery {
    public static void main(String[] args) {

        //kll dan bir sayı al
        //+ ise 2 katıı yazdırın
        //değilse sayıya 10 ekleyip yazdırın


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");

        double sayi= scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi*2);
        }else {
            System.out.println(sayi + 10);
        }

        System.out.println(sayi>0 ? 2*sayi : sayi+10);






    }
}
