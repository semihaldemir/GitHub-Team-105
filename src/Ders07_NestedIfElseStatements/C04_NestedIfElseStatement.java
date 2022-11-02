package Ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatement {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
// Erkek 65 yas ve uzeri emekli olabilir.
// Cinsiyet ve yasini dikkate alarak
// "Emekli olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.

        //ana deişken yaş olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yaşınızı giriniz");
        int yas= scan.nextInt();

        System.out.println("lutfen cinsiyeti giriniz");
        char cinsiyet=scan.next().charAt(0);


    }
}
