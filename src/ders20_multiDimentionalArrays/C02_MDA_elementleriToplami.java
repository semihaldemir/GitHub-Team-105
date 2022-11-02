package ders20_multiDimentionalArrays;

public class C02_MDA_elementleriToplami {
    public static void main(String[] args) {

        int[] arr1={3,5,7,9};
        int toplam=0;
        for (int i = 0; i < arr1.length ; i++) {
            toplam+=arr1[i];
        }
        System.out.println("Tek katlı array elementler toplamı: "+ toplam);


        int[][] arr={{1,2},{3,4,5},{7}};

        toplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];

            }

        }
        System.out.println("2 katlı arrayın elementleri toplamı: " + toplam);
    }
}
