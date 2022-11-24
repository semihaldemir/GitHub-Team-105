package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {
        // verilen bir array'i tekrar eden elementlerini silip her elementin
        // sadece 1 kere kullanıldığı hale getirin

        int[] arr={4,5,6,7,8,9,1,2,3,6,5,4,7,8,9};

        Set<Integer> geciciSet=new HashSet<>();

        for (Integer each:arr
             ) {
            geciciSet.add(each); // set tekrara izin vermez
        }

        arr=new int[geciciSet.size()];

        // setteki elementleri arr'yr taşıyalım

        int index=0;
        for (Integer each:geciciSet
             ) {
            arr[index]=each;
            index++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
