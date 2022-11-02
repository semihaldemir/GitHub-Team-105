package ders22_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotsayisisi {
    public static void main(String[] args) {
        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double> notlar = listeOlustur();

        System.out.println(notlar);

        raporla(notlar);

    }

    private static void raporla(List<Double> notlar) {
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin
        int ogrencisayisi= notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiOgrenciSayisi=0;

        // notlar toplamını bulalım

        for (int i = 0; i < notlar.size(); i++) {

            notlarToplami += notlar.get(i);

        }

        sinifNotOrtalamasi=notlarToplami/ogrencisayisi;

        for (int i = 0; i < notlar.size(); i++) {

            if (notlar.get(i)>sinifNotOrtalamasi){
                ortalamaUstundekiOgrenciSayisi++;
            }

        }
        // rapor için istenenleri yazdıralım

        System.out.println("Girilen Not Sayisi: " + ogrencisayisi +
                "\nGirilem Notların Ortalaması: " + sinifNotOrtalamasi +
                "\nOrtalama üzerinde Not Alan Öğrenci Sayisi: " + ortalamaUstundekiOgrenciSayisi);





    }

    public static List<Double> listeOlustur() {

        List<Double> notlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Double girilenNot = (double) 5;

        while (girilenNot <= 100) {
            System.out.println("listeye girmek için not giriniz" +
                    "\nbitirmek için 100 den büyük bir sayı basın");
            girilenNot = scan.nextDouble();

            if (girilenNot <= 100) {
                notlar.add(girilenNot);
            }
        }
        return notlar;
    }
}
