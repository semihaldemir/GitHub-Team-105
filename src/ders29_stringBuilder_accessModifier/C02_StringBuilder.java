package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java Candır");

        System.out.println(sb1.reverse()); // rıdnaC avaJ

        System.out.println("tersini yazdırdıktan sonra sb1: " + sb1); // tersini yazdırdıktan sonra sb1: rıdnaC avaJ

        System.out.println(sb1.insert(0,".")); // .rıdnaC avaJ

        System.out.println(sb1); // .rıdnaC avaJ

        sb1.reverse();

        StringBuilder sb2=new StringBuilder("Java Candır.");
        String str="Java Candır.";
        System.out.println(sb1==sb2); // false
        System.out.println(sb1==sb1); // true
        // System.out.println(sb1==str); iki farklı data turu == ile karşılaştırılamaz

        System.out.println(sb1.equals(sb2)); // false içerik aynı olsa bile false verir
        System.out.println(sb1.equals(sb1)); // true kendisi ile karşılaştırıldığı için
        System.out.println(sb1.equals(str)); // false CTE vermez fakat sonuç herzaman false olur

        System.out.println(sb1.compareTo(sb2)); // 0
        StringBuilder sb3=new StringBuilder("Hala Kandır");
        System.out.println(sb1.compareTo(sb3)); // 2

         /*
        CompareTo sadece tamamen ayni mi yoksa farkli mi sorusunun cevabini verir
        tamamen ayni ise ==> 0 döner
        farklilik varsa ==> ilk farkli harfi buldugunda, farkli harflerin arasinda kac harf oldugunu verir
         */

    }

}
