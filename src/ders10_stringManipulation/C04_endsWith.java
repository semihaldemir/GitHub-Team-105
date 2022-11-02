package ders10_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String str="Java heryerde güzeldir";
        System.out.println(str.endsWith("güzeldir"));

        System.out.println(str.endsWith(""));

        System.out.println(str.endsWith("Java"));//false



    }
}
