package ders01_programlamayaGiris;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen Ondalklı Bir Sayı Giriniz");
        double ondalikliSayi=scan.nextDouble();

        System.out.println("Lutfen Tam Sayı Giriniz");
        int tamSayi=scan.nextInt();

        System.out.println("Girien Sayıların Toplamı" + (ondalikliSayi+tamSayi));

        System.out.println("Girilen Sayıların Çarpımı" + (ondalikliSayi*tamSayi));


    }
}
