package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {
        //verilen bir int arrayde en küçük ve en büyük sayıları yazdıran bir method olusturun.

        int[] arr={3,8,1,5,2,9};
        enBuyukEnKucukElementYazdir(arr);
    }

    public static void enBuyukEnKucukElementYazdir (int[] arr){
        Arrays.sort(arr);
        System.out.println("en buyuk element: " + arr[arr.length-1]);
        System.out.println("enkucuk element: " + arr[0]);

    }
}
