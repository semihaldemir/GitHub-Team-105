package ders14_methodOlusturma;

public class C07_MethodSoru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        Girilen sayinin asal sayi olup olmadigini kontrol edip,
        sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
         */

        int sayi = 23;

        System.out.println(asalsayiMetodu(sayi));

    }

    public static String asalsayiMetodu(int sayi) {
        String sonuc = "";

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sonuc = "asal değil";
                break;
            }
        }// forloop bitecek sonra if
        if (!(sonuc.equals("asal değil"))) {
            sonuc = "asal";
        }
        return sonuc;

    }


}
