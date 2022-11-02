package ders10_stringManipulation;

public class C08_lastindexof {
    public static void main(String[] args) {

        String str="Java hafiften beyin yakıyor";

        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.lastIndexOf('e'));

        System.out.println(str.lastIndexOf("Java"));

        System.out.println(str.lastIndexOf("e",14));

    }
}
