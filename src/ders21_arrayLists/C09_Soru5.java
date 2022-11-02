package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Soru5 {
    public static void main(String[] args) {
        /*
        // Soru 5- Kullanicidan pozitif bir tamsayi alip,
        //         o tamsayidan kucuk Fibonacci sayilarini bir liste olarak kaydedin ve yazdirin
}
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz");
        int girilensayi= scan.nextInt();

        if (girilensayi<0){

            System.out.println("Fibonacci serisi için 0'dan büyük tamsayı girmelisin");
        } else if (girilensayi==0) {
            System.out.println("0'dan küçük Fibonacci sayisi yoktur");

        } else if (girilensayi==1) {
            System.out.println("1'den küçük tek fibonacci sayısı vardır : 0");

        }else {
            fibonacciSayilariniYazdir(girilensayi);
        }
        {

        }
    }

    private static void fibonacciSayilariniYazdir(int girilensayi) {
        // buraya geldiyse girilen sayı 1'den büyüktür

        List<Integer> fibonacciListedi=new ArrayList<>();
        fibonacciListedi.add(0);
        fibonacciListedi.add(1);
        fibonacciListedi.add(1);

        int yeniFibonacciSayisi=0;
        int index=3; // ilk 3 eleman 0 1 1 olduğu için 3. indexe geldik

        while (yeniFibonacciSayisi<girilensayi){
            yeniFibonacciSayisi=fibonacciListedi.get(index-2) + fibonacciListedi.get(index-1);

            if (yeniFibonacciSayisi<girilensayi){
                fibonacciListedi.add(yeniFibonacciSayisi);
            }
            index++;
        }
        System.out.println(fibonacciListedi);
    }
}
