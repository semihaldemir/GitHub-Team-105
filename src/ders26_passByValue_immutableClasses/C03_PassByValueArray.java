package ders26_passByValue_immutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {

        // verilen bir arrayin elementlerini 5 artırıp sonra yazdıran bir method oluşturun


        int[] arr={3,4,5};

        elemanlaribesartir(arr);
        elemanlaribesartir(arr);
        elemanlaribesartir(arr);

        System.out.println("method calldansonra : " + Arrays.toString(arr));

    }
    public static void elemanlaribesartir (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));

    }
}
