package ders42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {
    /*
    Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin,
    not grime islemi bittiginde Q’ya basmalidir.
    Not grime islemi bittikten sonra asagidaki sekilde output hazirlayin
 not ortalamasi : …..
 ogrenci sayisi : …..
 ortalama altindaki ogrenci sayisi : ….
 ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….
     */

    static List<Double> notListesi=new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Öncelikle öğrenci not listesini oluşturalım");
        notListesineDegerEkle();

        double notToplami=0;
        double notOrt;
        int ortAltindakiOgrSAyisi=0;
        int ort10PAltUstOgrSayisi=0;

        for (Double each:notListesi
             ) {
            notToplami+=each;
        }
        notOrt=notToplami/notListesi.size();

        for (Double each:notListesi
             ) {
            if (each<notOrt) {
                ortAltindakiOgrSAyisi+=1;
            }
            if (each>=notOrt-10 && each<=notOrt+10){
                ort10PAltUstOgrSayisi+=1;
            }

        }

        System.out.println("Not Ortalaması: " + notOrt);
        System.out.println("Öğrenci Sayisi: " + notListesi.size());
        System.out.println("Ortalama Altındaki Öğrenci Sayısı: " + ortAltindakiOgrSAyisi);
        System.out.println("Ortalamanın 10 puan altındaki ve üstündeki öğrenci sayısı: " + ort10PAltUstOgrSayisi);


    }

    public static void notListesineDegerEkle(){
        Scanner scan=new Scanner(System.in);
        double not;
        boolean loopDevam=true;

        while (loopDevam){
            try {
                System.out.println("Lütfen öğrenci notlarını giriniz.\nBitirmek için Q'ya basınız");
                not= scan.nextDouble();
                notListesi.add(not);
            } catch (Exception e) {
                String girilenDeger=scan.nextLine();

                if (girilenDeger.equalsIgnoreCase("Q")){
                    loopDevam=false;
                    break;
                }else {
                    System.out.println("not için sayısal değer girmelisiniz");
                }

            }

        }
    }
}
