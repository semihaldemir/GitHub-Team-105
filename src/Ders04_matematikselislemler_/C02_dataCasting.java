package ders04_matematikselislemler_;

import java.util.Scanner;

public class C02_dataCasting {
    //soru4

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki sayı girin");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        int bolmeSonucuTamsayi=(int)(sayi1/sayi2);

        System.out.println(bolmeSonucuTamsayi);
        }
    }

