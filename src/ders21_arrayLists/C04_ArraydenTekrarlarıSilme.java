package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlarıSilme {
    public static void main(String[] args) {

        /*
        verilen bir arraydeki tekrar eden sayıları bir kere olacak şekilde
        olacak şekilde array'i düzenleyin
         */

        int[] arr={1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // bu soruyu arrayle yapmak cok zor
        // bunun yerine bu array'in elemanlarını tek tek inceleyip
        // tekrarrsız olanları bir liste atalım
        // en son o listteki elementleri içeren bir array oluşturup
        // yeni arrayi eski arraye değer olarak atayalım
        List<Integer> tekrarsizList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!(tekrarsizList.contains(arr[i]))){
                tekrarsizList.add(arr[i]);
            }

        }
        System.out.println("tekrarsız liste: "+tekrarsizList);

        arr=new int[tekrarsizList.size()]; /// [0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsizList.get(i);


        }
        // array istenen hale geldi

        System.out.println("tekrarsız hal: " + Arrays.toString(arr));

    }
}
