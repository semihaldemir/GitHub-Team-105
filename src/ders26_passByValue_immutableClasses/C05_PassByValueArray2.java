package ders26_passByValue_immutableClasses;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {

        // bir metod oluşturun
        //main metodda verilen arrayin uzunluğundan 2 fazla olan
        // ve elementlerin tamamı 5 olan yeni bir array oluşturup
        // değer olark sayılar arrayine atayın ve sayılar arrayini yazdırın


        int[] sayilar={3,4,5};

        arrayaYeniDegerAta(sayilar);
    }
    public static void arrayaYeniDegerAta (int[] sayilar){

        int[] yeniArray=new int[sayilar.length+2];

        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i]=5;

        }
        sayilar=yeniArray;

        System.out.println("metodda sayıların son hali : " + sayilar);
    }
}
