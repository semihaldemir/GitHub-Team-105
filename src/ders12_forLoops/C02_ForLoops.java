package ders12_forLoops;

public class C02_ForLoops {
    public static void main(String[] args) {

        for (int i = 0; i <=10 ; i++) {
            System.out.print(i+" "); //i:1
        }
        System.out.println();
        // 2 babamaklı sayılardan 7 ile bölünebilenleri yan yana yazdırın

        for (int i = 10; i <100 ; i++) {
            if (i%7==0) System.out.print(i+" ");
        }
        System.out.println();

        // 13'ten başlayarak 100'e kadar 7'şer artırıp yazdıralım

        for (int i = 13; i <100 ; i+=7) {
            System.out.print(i+" ");
        }

        System.out.println();
        // 1'den 10'a kadar (sınırlar dahil) sayıların karelerini yazdıralım

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i*i+" ");
        }




    }
}
