package ders20_multiDimentionalArrays;

public class C04_MDA_CiftSayiAdedi {
    public static void main(String[] args) {

        // verilen 2 katlı bir integer arraydeki çift sayı adedini bulan birkod yazın

        int[][] arr={{4,6},{3,5,8},{1,8,4}};

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    sayac++;
                }

            }

        }
        System.out.println(("arraydeki çift sayı sayısı: " + sayac));
    }
}
