package ders08_turnery_switch;

public class C02_Turnery {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        //verilen 2 metin aynı ise "metinler aynı"
        //farklı ise "metinler farklı" yazdırın

        if (str1.equals(str2)){
            System.out.println("metinler aynı");
        }else {
            System.out.println("metinler farklı");
        }


        System.out.println(str1.equals(str2) ? "metinler aynı" : "metinler farklı");


    }
}
