package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArtirma;
import ders18_arrays.C04_ArrayElementleriniToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlaiKullanma {
    public static void main(String[] args) {

        //verilen bir int arrayın elementlerini 2 artırın

        int[] arr={2,3,4};
        arr=C03_ArrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));

        // arr arrayın elementlerini toplayıp sonucu yazdırın

        System.out.println(C04_ArrayElementleriniToplama.pozitifElementleriTopla(arr));

        // arr arrayinde 10 element olarak var mı?

        C05_ArraydeElemanArama.elemanAra(arr, 10); // aranansayı arrayde yok

        // kull dan bir değer alarak bir array oluşturun

        int[] yeniArr = C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));
    }
}
