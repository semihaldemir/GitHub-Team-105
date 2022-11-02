package Ders07_NestedIfElseStatements;

public class C03_IfNestedIfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
// Erkek 65 yas ve uzeri emekli olabilir.
// Cinsiyet ve yasini dikkate alarak
// "Emekli olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.

        char cinsiyet='e';
        int yas=66;

        //nested if else kul için öne ana değşkeni seçip
        //ona göre yaıyı oluşturalım
        //cinsiyet ana değişken olsun

        if (cinsiyet=='k' || cinsiyet=='K' ){
            if (yas<15){
                System.out.println("hatalı yaş girişi");
            } else if (yas<60) {
                System.out.println("emekli olabilmek için "+ (60-yas)+" yıl daha çalşmalsın");
            } else {
                System.out.println("emekli olabilirsin");
            }


        } else if (cinsiyet=='e' || cinsiyet=='E') {
            if (yas<15){
                System.out.println("hatalı yaş girişi");
            }else if (yas<65) {
                System.out.println("emekli olabilmek için "+ (65-yas)+" yıl daha çalşmalsın");
            } else {
                System.out.println("emekli olabilirsin");
            }




        }else {
            System.out.println("yanlıs cinsiyet girişi");
        }

    }
}
