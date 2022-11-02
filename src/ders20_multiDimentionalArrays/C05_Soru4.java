package ders20_multiDimentionalArrays;

public class C05_Soru4 {
    public static void main(String[] args) {
        //Soru 4- Verilen 2 katli bir array’de
        // bulunan tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr={{5,7},{5,8,9},{0,1}};

        System.out.println(arrayinElemanlariniCarp(arr));



    }
    public static int arrayinElemanlariniCarp (int[] [] arr){
        int sonuc=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                sonuc*=arr[i][j];


            }

        }

        return sonuc;
    }

}
