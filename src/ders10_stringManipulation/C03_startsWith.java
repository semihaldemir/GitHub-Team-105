package ders10_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str="mantı acarken java oğrenilmez";

        System.out.println(str.startsWith("Mantı"));//false

        System.out.println(str.startsWith("m"));//true

        System.out.println(str.startsWith(""));//true

        System.out.println(str.startsWith("acarken", 6));//true

        System.out.println(str.startsWith("mantı",0));//true
    }
}
