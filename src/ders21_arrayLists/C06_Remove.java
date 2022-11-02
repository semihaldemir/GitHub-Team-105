package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_Remove {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};


        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        sayilar.remove(2);// bulduğu ilk 2 yi siler
        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar);

        /*
        liste integerlardan oluşuyorsa
        biz int bir değer yazdırdığımızda hep index kabul ettiğinden
        istediğiniz elementi obje olarak girip sildirmek için
        önceden tanımlamamız gerekir
         */

        Integer silinecekObje=4;
        sayilar.remove(silinecekObje);
        System.out.println(sayilar);

        // tüm 3 leri sildirin

        silinecekObje=3;

        while (sayilar.contains(silinecekObje)){
            sayilar.remove(silinecekObje);
        }
        System.out.println(sayilar); // [1, 2, 5, 2, 5, 1, 2, 5, 4, 5]

        silinecekObje=10;
        System.out.println(sayilar.remove(silinecekObje)); // false

        sayilar.remove(20); // IndexOutOfBoundsException


    }
}
