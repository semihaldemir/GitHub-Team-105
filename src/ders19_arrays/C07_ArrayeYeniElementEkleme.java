package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int[] arr={2,4,6};

        // bu arr'e 4. bir element olarak 8 ekleyelim

        /*
        var olan bir array'e yeni eleman eklenemez
        ama yeni değer atanabilir
        önce {2, 4, 6, 8} şeklinde yeni bir array oluşturursak
        sonra arr2 değerini arr'ye atayabilirim
         */
        // yeni array oluşturalım
        // array 2 ye konulacak dataların türü
        // uzunluğu ise eski arrayin uzunluğunun 1 fazlası

        int[] arr2= new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 0]

        arr2[arr2.length-1]=8;

        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 8]

        arr=arr2;

        System.out.println("arr'nin son hali: " + Arrays.toString(arr)); // [2, 4, 6, 8]
    }
}
