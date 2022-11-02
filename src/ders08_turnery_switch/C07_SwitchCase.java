package ders08_turnery_switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        //J: Java
        //D: Development
        //K: Kit
        //kull.dan bir harf alın
        //alınan harf J, D, K, dan biri ise yukarıdaki kelimeleri yazdırın
        //bu harflerden biri değilse égecersiz Harf" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        char harf=scan.next().charAt(0);

        switch (harf){
            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Development");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Geçersiz Harf");
        }
    }



}
