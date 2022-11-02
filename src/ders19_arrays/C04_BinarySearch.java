package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        int[] arr= {1,5,7,8,6,4,65,1};
        System.out.println(Arrays.binarySearch(arr, 8)); // 3

        System.out.println(Arrays.binarySearch(arr, 4)); //-2

        System.out.println(Arrays.binarySearch(arr, 1)); // 0

        System.out.println(Arrays.binarySearch(arr, 6)); // -3

        // binarySearch metodunun doğru sonucları verebilmesi için
        // öncelikle sort metodu kullanılmalıdır

        // sort() kullanmadan yapılan binary search doğru da verebilir yanlış da..

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 4, 5, 6, 7, 8, 65]

        System.out.println(Arrays.binarySearch(arr, 8)); // 6

        System.out.println(Arrays.binarySearch(arr, 4)); // 2

        System.out.println(Arrays.binarySearch(arr, 1)); // 1

        System.out.println(Arrays.binarySearch(arr, 6)); // 4


        // arrayde olmayan bir eleman aratırsak
        // java önce o sayı olsa nerede olurdu onu bulur,
        // sonra bulduğu bu SIRA'yı - işareti verir.

        System.out.println(Arrays.binarySearch(arr, -3)); // -1

        System.out.println(Arrays.binarySearch(arr, 23)); // -8

        System.out.println(Arrays.binarySearch(arr, 9)); // -8

        System.out.println(Arrays.binarySearch(arr, 100)); // -9
    }
}
