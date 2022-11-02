package ders12_forLoops;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {

        // kull verdiği sayının akamlar tplamını bulun

        int sayi=1453;
        String sayiStr=""+sayi;

        int birlerbasamağı=0;
        int rakamlartop=0;

        for (int i = 1; i <=sayiStr.length(); i++) {
            birlerbasamağı=sayi%10;
            rakamlartop=rakamlartop+birlerbasamağı;
            sayi=sayi/10;
        }
        System.out.println(rakamlartop);

    }
}
