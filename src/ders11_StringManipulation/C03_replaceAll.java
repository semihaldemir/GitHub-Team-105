package ders11_StringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str="J1ava2 G9uzel5dir8";

        //sayıları silelim

        //str.replaceAll() sadece bir harf veya char sequence'i değil
        //genelleme ilesoyleyebileceğimiz ortak ozellikteki tum karakterleri değiştirir

        System.out.println(str.replaceAll("\\d","")); //Java Guzeldir
        System.out.println(str.replaceAll("\\D",""));

        String s1="ilk urunun fiyatı :1250 tl";
        String s2="ikinci urunun fiyatı: 1500 tl";
        //iki urunun fiyatını toplayın

        s1=s1.replaceAll("\\D","");//"1250"
        s2=s2.replaceAll("\\D","");






    }
}
