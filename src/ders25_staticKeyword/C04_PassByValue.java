package ders25_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {

        double fiyat =100;

        System.out.println(indirimUygula(fiyat)); // 90

        System.out.println(fiyat); // 100
    }

    public static double indirimUygula(double fiyat) {
        fiyat=(fiyat*9)/10;
        return fiyat;
    }
}
