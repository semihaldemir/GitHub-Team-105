package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        // kull'dan bir index isteyin
        // verilen bir arrayden kullanıcının girdiği indexteki elementi yazdırın



        int[] arr={1,2,6,5,4,87,9,4,4,7,5,6};

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen bir index giriniz");
        int index= scan.nextInt();
        System.out.println(arr[index]);
    }
}
