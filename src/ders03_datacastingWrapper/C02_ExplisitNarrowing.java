package ders03_datacastingWrapper;

public class C02_ExplisitNarrowing {
    public static void main(String[] args) {

        int sayi=20;
        /*
        geni data turunek brdeğeridar data turudeki ir değere atamak istersenz
        java sorululuu alanızı ister
        bu sruluuu almak iin cast edeceğimiz değerin önüne () içerisnde cast etmek stediğmz data turu yazılır
         */
        short sh=(short) sayi;
        System.out.println(sh); //20

        double dbl=23.5;
        int say=(int)dbl;

        System.out.println(say);

    }
}
