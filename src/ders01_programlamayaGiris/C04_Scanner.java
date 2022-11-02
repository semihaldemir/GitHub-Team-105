package ders01_programlamayaGiris;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan smni alıp büyk harferle yazdırn

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz");

        String kullaniciAdi= scan.next();

        System.out.println(kullaniciAdi.toUpperCase());
    }
}
