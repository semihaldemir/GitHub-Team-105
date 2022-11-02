package ders10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str="Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok"));

        System.out.println(str.contains("odla"));

        System.out.println(str.contains("a"));

        // char sequence: chardizisi

        System.out.println(str.contains("java"));

        String str2="Java";

        System.out.println(str.contains(str2));

        String str3="234 Ali Can";

        //str3.contains(2);
        str3.contains("2");




    }
}
