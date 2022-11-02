package ders03_datacastingWrapper;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        /* kullanıcıdan bir tamsayı alın
        kullanıcı kaçsayı girerse girsin
                konsolda -128 ile+128 arasında bir sonç yazdıracak
                od yazınız

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("tam sayı gir");

        int girilenSayi=scan.nextInt();

        byte donusensayi=(byte) girilenSayi;

        System.out.println("girdiğiniz"+girilenSayi + "donuşmuşhali"+donusensayi);

    }
}
