package ders0_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // kull iki sayı alın eğer 1. sayı 100den buyukse "ilk sayı 100 den buyuk" yazdırın
        // eger 2. sayıciftse"ikincisayıcift" yazdır
        //eger 1. sayı 2. sayıdan buyukse " ilk sayı dha abuyuk" yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki tamsayı girin");

        int s1 = scan.nextInt();
        int s2 = scan.nextInt();

        if (s1 > 100) {
            System.out.println("ilk sayı 100 den buyuk");
        }

        if (s2 % 2 == 0) {
            System.out.println("ikinci sayı cift");
        }

        if (s1 > s2) {
            System.out.println("ilk sayı dha abuyuk");
        }


    }
}