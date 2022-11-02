package ders26_passByValue_immutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str="Java Candır";

        str=str.toUpperCase();

        System.out.println(str);

        /*
        immutable classlardan oluşturulan bir objenin değeri DEĞİŞTİRİLEMEZ
        eğer atama yaparsak java değerini değiştirmez
        bunun yerine yeni bir obje oluşturur
        ve bu yeni objeye yeni atadığınız değeri atar

        eski obje boşa çıkar ve garbage collector tarafından silinmeyi bekler
         */
    }
}
