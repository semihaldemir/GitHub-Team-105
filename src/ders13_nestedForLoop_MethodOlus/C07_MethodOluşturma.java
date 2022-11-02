package ders13_nestedForLoop_MethodOlus;

public class C07_MethodOluşturma {
    public static void main(String[] args) {

        String str="Java muhteşemdir";

        // metni büyük harfe çevirin

        String buyukStr=str.toUpperCase();

        System.out.println(str); //Java muhteşemdir

        System.out.println(buyukStr);//AVA MUHTEŞEMDİR

        //metnin buyuk harflere çevrilmiş hali S içerir mi?

        System.out.println(buyukStr.contains("Ş"));
    }
}
