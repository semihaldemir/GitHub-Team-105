package ders15_overloading_whileloop;

public class C07_whileLoop_soru5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        While loop kullanarak verilen sayinin istenen ussunu
        hesaplayip yazdiran bir method olusturun.
         */

        int sayi=4;
        int us=3;

        ushesapla(sayi,us);

    }

    public static void ushesapla (int sayi, int us){
        int sonuc=1;

        while (us>0){
            sonuc*=sayi;

            us--;
        }

        System.out.println(sonuc);

    }
}
