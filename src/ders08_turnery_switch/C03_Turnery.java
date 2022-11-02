package ders08_turnery_switch;

public class C03_Turnery {
    public static void main(String[] args) {

        int a=5;
        /*
        turnery operatoru tek başına yazılaaz,
        turnery bize sonuc uretir
        bu sonucu ya direk yazdırmalı veya bir variable a atamalıyız.
         */



        //a%2==0 ? "Çift Sayı" : "Tek Sayı"; tek başına hata verir.

        String sonuc=a%2==0 ? "Çift Sayı" : "Tek Sayı";

        /*
        Turnery nin soncun bir variable a atayacaksak
         tre ve false durumlarında uretilecek sonucun anı data turune uygun oması gerekir
         aksi halde CTE oluşur.

         ama tuneryi sout içinde kulanırsak
         sonucların data turunun aynı olması sart olmaz
         */
        String sonuc2=a>10 ? "Buyuk sayı" : ""+2*a; // CTE vermemesi içi Stringe cevidik

        System.out.println(a>10 ? "Buyuk sayı" : ""+2*a);




    }
}
