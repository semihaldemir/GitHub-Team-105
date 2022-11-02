package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    public static void main(String[] args) {
        // main method içerisinde kullanıcıdan 2 sayı alın
        //bu iki sayıyı parametre olarak kabul edip çarpımlarını main metoda döndüren bir method oluşturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println(carpimMetodu(sayi1, sayi2));

        double carpimsonucu=carpimMetodu(6,2);
        System.out.println(carpimsonucu);

        //method main metodun dışında olur
    }

    public static double carpimMetodu(double sayi1, double sayi2){
        System.out.println("çarpım metodu çalıştı");
        return sayi1*sayi2;
    }



}
