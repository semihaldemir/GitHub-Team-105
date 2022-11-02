package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayeYeniDegerAtama {
    public static void main(String[] args) {



        /*
        var olan bir arrayin uzunluğu değiştirilemez
        AMA
        var olan bir array'e yeni bir değer atanabilir
         */

        // 1- var olan bir array'i yeni değer olarak atayabiliriz

        String str = "java";
        str="hava";

        String [] arr1= {"Ali","Veli"};
        String [] arr2= {"A","B","C"};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1)); // [A, B, C]

        // 2- istediğimiz uzunlukta yeni boş bir array değeri atayabiliriz

        arr1=new String[6];
        System.out.println(Arrays.toString(arr1)); //[null, null, null, null, null, null]

        // 3- yeni oluşturulan bir array'e  {} içinde değer yazarak atama yapabiliriz
        //    ancak var olan bir array'e yeni değer ataması için {} KULLANILMAZ
        //    arr1={"g","h"}; olmaz
    }
}
