package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        //kull'dan istediği kadar sayı alıp bir array oluşturun
        //kull eleman girişini bitirmek için 0'a bassın

        Scanner scan= new Scanner(System.in);
        int[] arr={0};
        int girilenSayi=0;

        do {
            System.out.println("Array'e eklemek için bir sayı giriniz "+
                    "\nBitirmek için 0'a basın");

            girilenSayi = scan.nextInt();

            if (arr[0]==0){
                arr[0]=girilenSayi;

            }else if (girilenSayi!=0){
                arr=C08_ArrayeElemanEklemeMetodu.arrayeElemanEkle(arr,girilenSayi);
            }




        }while (girilenSayi!=0);

        System.out.println(Arrays.toString(arr));
    }
}
