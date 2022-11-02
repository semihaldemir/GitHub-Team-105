package ders11_StringManipulation;

public class C07_soru {
    public static void main(String[] args) {

/*
Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
 - ismi daha uzun ise,
 isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
 - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk,
 soyismi buyuk harflerle yazdirin.
 */
        String isim="mehmet";
        String soyisim="Harunsoy";
        String yeniisimsoyisim;

        if (isim.length()>soyisim.length()){
            yeniisimsoyisim=isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+" "+
                    soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).toLowerCase();
            System.out.println(yeniisimsoyisim);

        }else {
            yeniisimsoyisim=isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+" "+
                    soyisim.substring(0).toUpperCase();
            System.out.println(yeniisimsoyisim);
        }




    }
}
