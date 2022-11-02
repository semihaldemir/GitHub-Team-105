package ders13_nestedForLoop_MethodOlus;

import java.util.Scanner;

public class C08_MethodOlluşturma {
    public static void main(String[] args) {

        /*
        kull'dan 2 sayı alıp bunların toplamını yazdıran bir method oluşturun
            */

        isteToplaYazdır();
        isteToplaYazdır();

    }

    public static void isteToplaYazdır (){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Girilen Sayıların Toplamı: "+ (sayi1+sayi2));
    }




}
