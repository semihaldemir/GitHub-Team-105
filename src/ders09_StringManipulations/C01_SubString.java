package ders09_StringManipulations;

public class C01_SubString {
    public static void main(String[] args) {

        String str= "Java ogren, işi kap";

        System.out.println(str.substring(5)); //ogren, isi kap

        System.out.println(str.substring(str.length()-1).toUpperCase());

        // son uç harfi buyuk harf olarak yazdırın

        System.out.println(str.substring(str.length()-3).toUpperCase());


    }
}
