package ders08_turnery_switch;

public class C05_NestedTurnery {
    public static void main(String[] args) {
        /*
        kull dan bir tamsayı alın
        + ise cift sayı veya cift sayı deil seceneklerinden uygun olanı yazdırın
        sayı pozitif değilse, 3 basamaklı veya 3 basamaklı değil seceneklerinden uygun olanı yazdırın.
         */

        int sayi=20;
        if (sayi>0){
           //+ ise cift sayı veya cift sayı deil seceneklerinden uygun olanı yazdırın
            System.out.println(sayi%2==0 ? "çift sayı" : "çift sayi değil");



        }else {
            //sayı pozitif değilse, 3 basamaklı veya 3 basamaklı değil seceneklerinden uygun olanı yazdırın.

            System.out.println(sayi<-99 && sayi>-1000 ? "üç basamaklı" : "üç basamaklı değil");

        }

        //turnery ile yapalım

        String sonuc=sayi>0
                ?
                sayi%2==0 ? "çift sayı" : "çift sayi değil"
                :
                sayi<-99 && sayi>-1000 ? "üç basamaklı" : "üç basamaklı değil";






    }
}
