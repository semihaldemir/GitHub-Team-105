package ders22_arrayList;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {

        Integer[] arr={1,2,3};

        // verilen bir arrayi liste çevirmek için bir list oluşturup forloop ile elemetleri taşımayı tavsiye ediyoruz

        List<Integer> arraydenList= Arrays.asList(arr);

        System.out.println(arraydenList);

        // bu yöntemin 2 negatif yönü vardır.
        // 1- Bu şekilde oluşturulan listler esnek uzunluğa sahip değillerdir
        //       add, remove gibi özellikleri kullanmak isterseniz RunTimeException oluşur

        // arraydenList.add(10); // .UnsupportedOperationException
        //arraydenList.remove(1); // .UnsupportedOperationException

        // 2- bu yöntem kaynak olan array ile yeni oluşturulan list'i birbirine bağlar
        //    birinde yaptığınız değişikliği, otomatik olarak diğerine de yansıtır.

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Liste : " + arraydenList);

        // sadece array'ın bir elemanını değiştirelim
        arr[0]=10;

        System.out.println("Array'i değiştirince Array : " + Arrays.toString(arr));
        System.out.println("Array'ı değiştirince Liste : " + arraydenList);

    }
}
