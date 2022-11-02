package ders11_StringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str="Java güzeldir";

        System.out.println(str.repeat(4));
        //Java güzeldirJava güzeldirJava güzeldirJava güzeldir

        str="   Java güzeldir     ";
        System.out.println(str.length());

        str=str.trim();

        System.out.println(str);
        System.out.println(str.length());


    }
}
