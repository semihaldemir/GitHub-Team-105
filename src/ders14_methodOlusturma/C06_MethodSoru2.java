package ders14_methodOlusturma;

public class C06_MethodSoru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
 isim bosluk soyisim seklinde bize donduren bir method olusturun
 input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz
         */

        String isim="ömer";
        String soyisim="kesen";

        System.out.println(adsoyadbirMetodu(isim, soyisim));//Ömer Kesen
        System.out.println(adsoyadbirMetodu("ali","OSMAN"));//Ali Osman
    }

    public static String adsoyadbirMetodu (String isim, String soyisim){

        String isimsoyisim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()+
                " " +
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();
        return isimsoyisim;
    }
}
