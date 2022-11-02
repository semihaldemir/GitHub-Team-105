package ders26_passByValue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        double fiyat =100;

        System.out.println(indirimUygula(fiyat)); // 90
        System.out.println(indirimUygula(fiyat)); // 90
        System.out.println(indirimUygula(fiyat)); // 90

        System.out.println(fiyat); // 100

        fiyat=indirimUygula(fiyat);

        System.out.println("indirim uygulanmış yeni fiyat : " + fiyat); // 90
    }
    /*
    kodlarımızın anlaşılır olması için main metottan diğer metotlara parametre olarak
    gönderdiğimiz variablelar için aynı isimli variable oluşturmayı TERCİH EDERİZ

    java methodlar arasında geçiş yaparken variable ı değil variableın value'sunu pass eder.

    bu javanın pass by value yu tercih etmesinden kaynaklanıyor

    eğer metodu içerisinde yaptığınız değişikliğin main method için de geçerli olmasını isterseniz main metot içersinde
    fiyat==indirimUygula(fiyat); atamasını yapabiliriz.
     */


    public static double indirimUygula(double fiyat) {
        fiyat=(fiyat*9)/10;
        return fiyat;
    }
}
