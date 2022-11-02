package ders04_matematikselislemler_;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        //kullanıcıdan 2 int değer alıp bunları birbirine bölüp sonucu double olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tamsayı giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println(sayi1/sayi2);

        double ondaliklisonuc=(double) (sayi1/sayi2); // 3.0

        System.out.println(ondaliklisonuc);

        double dogrusonuc=(double)sayi1/sayi2; //3.66666
        System.out.println(dogrusonuc);


    }
}
