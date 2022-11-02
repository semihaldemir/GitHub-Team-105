package ders22_arrayList;

import java.util.Arrays;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int[] arr={3,5,7,8,4,2,6,9,6,4,5};

        // bu array'deki %'den büyük olan elementleri toplayalım

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>5){
                toplam+=arr[i];
            }

        }
        System.out.println("ForLoop ile toplam : " + toplam);


        // Foe Each Loop'da daha basit bir kurgu ile çalışı
        // For EachLoop'a 3 şeyi söylememiz gerekir
        // 1- hangi data türünde değişkenlerle uğraşacaksınız?
        // 2- Loop'un içerisinde her bir eleman geldiğinde hangi isimle işlem yapacaksınız?
        // 3- Hangi Array veya collection'dan elemanlar gelecek
        toplam=0;


        for (int each:arr  // arr'ye git her bir integerı bana getir
             ) {
            if (each>5){
                toplam += each;
        }

        }
        System.out.println("For-each loop ile toplam : " + toplam);
    }
}
