package ders15_overloading_whileloop;

public class C02_Overloading {
    public static void main(String[] args) {

        carpim(3,5);
        carpim(3.4,2);

    }
    // bir class daaynı isim ve aynı signature a sahip iki metod olmaz

    /*
    method overloading olan classlarda java hangi metodun çalışacağına şöyle karar veriri
    1-önce method ismine bakar
    2-argument sayısı ile parametre sayısına bakar
    3-argument ve parametre uyumuna bakar

     */

    public static void carpim (int sayi1, int sayi2){// carpım int int
        System.out.println("iki integer sayının çarpımı: "+sayi1*sayi2);
    }

    public static void carpim (int sayi1, int sayi2, int sayi3) {// carpım int int int
        System.out.println("iki integer sayının çarpımı: " + sayi1 * sayi2 * sayi3);

    }
    public static void carpim (double sayi1, int sayi2){// carpım double int
        System.out.println("double ve integer sayının çarpımı: "+sayi1*sayi2);
    }
    public static void carpim (int sayi1, double sayi2){// carpım int double
        System.out.println("integer ve double sayının çarpımı: "+sayi1*sayi2);
    }
    public static void carpim (double sayi1, double sayi2){// carpım double double
        System.out.println("iki double sayının çarpımı: "+sayi1*sayi2);
    }

}
