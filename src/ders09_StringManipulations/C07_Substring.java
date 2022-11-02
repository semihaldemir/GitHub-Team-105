package ders09_StringManipulations;

public class C07_Substring {
    public static void main(String[] args) {

        String str="Java gun geçtikçe guzelleşiyor";

        str.substring(5,8);
        // 5. indexten başlar (5-8) karakter yazdırıı
        //5. index dahil (inclusive), 8. index hariç (Exclusive)

        System.out.println(str.substring(9,17));//gectikçe

        String isim="hasan";
        //VERİLEN İSMİ İLK HARFİ BUYUK GERYE KALANLAR KUÇUK OLARAK KAYDEDİN

        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();

        System.out.println(isim);

        //System.out.println(isim.substring(5,2)); hata verir geriye calışmaz



    }
}
