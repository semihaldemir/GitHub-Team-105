package ders17_scope;

public class C04_ClassVariables {

    public static void main(String[] args) {
        //c03teki hastane ismini yazdırmak istiyoruz
        System.out.println(C03_ObjectVariables.hastaneismi);// yıldız hastanesi

        System.out.println(C03_ObjectVariables.hastasayisi);// 23548

        C03_ObjectVariables.hastasayisi++;
        C03_ObjectVariables.hastasayisi++;
        method();

        System.out.println(C03_ObjectVariables.hastasayisi);

    }   // kod takibi main methoddan başlar main methodun sonuna gelindiğinde
        // herşey biter tüm değişimler resetlenir
        // variable değerleri bastaki hallerine gelir

    public static void method (){
        C03_ObjectVariables.hastasayisi++;
    }
}

/*
java runtime bir programdır
calışmayabaşladığında variablelara atanan değerleriişler
calıştığı muddetce yapılan değerleri kaydeder
 */
