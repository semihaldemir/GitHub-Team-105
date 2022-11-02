package ders14_methodOlusturma;

public class C04_tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //bu iki sayının carpım sonucunu yeni kod yazmadan konsola yazdırın

        System.out.println(C01_Carpim.carpimMetodu(a, b));

        String c="Nasıl";
        String d="Yani";

        //aralarında bir boşluk bırakarak yazdırın

        System.out.println(C02_StringConcate.birlestirMetodu(c,d));//Nasıl Yani

        String e="bu da mı oldu?";
        //tersten yazdırın

        System.out.println(C03_StringTersecevirme.tersecevirmeMetodu(e));

        //"bucümleyi terse çevirin"

        System.out.println(C03_StringTersecevirme.tersecevirmeMetodu("bucümleyi terse çevirin"));

        String str="Java çok güzel";
        //buyuk harf olarak yazdırın





    }
}
