package ders20_multiDimentionalArrays;

public class C06_MDA_Soru5 {
    public static void main(String[] args) {


        int[][] arr={{5,7},{5,8,9},{0,1}};

        sonElementleriTopla(arr);



    }
    public static void sonElementleriTopla (int [][] arr){
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i][arr[i].length-1];

            }
        System.out.println("inner arraylerin son elementlerinin toplamı: "+toplam);

        }
    }

