package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Ahmet hoca ile herşey clear";

        System.out.println(str.indexOf("a")); // 9, ilk a nın indexini döndürür

        System.out.println(str.indexOf('c')); // 8

        System.out.println(str.indexOf("herşey")); //15, hangi indexten başlıyorsa onu döndürür.

        System.out.println(str.indexOf("e",9)); // 13, 9 dan sonra sayıp ilk e'yi verir

        System.out.println(str.indexOf("e",13));// 13, 13. index e olduğu için 13u verir

        // cumledeki 2. c'nin index'ini yazdırın

        int ilkcindex=str.indexOf("c");
        System.out.println(ilkcindex);

        System.out.println(str.indexOf("c",ilkcindex+1)); // 22

        //olmayan bir index için -1 döner


    }
}
