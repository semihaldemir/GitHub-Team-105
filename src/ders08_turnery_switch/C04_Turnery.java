package ders08_turnery_switch;

public class C04_Turnery {
    public static void main(String[] args) {
        /*
        kulldan bir üçgenn 3 kenar uunuunu alın
        uçgen eşkenar ise "eşgenar uçgen" yazdırın, değilse "eşkenar değil" yazdırın
         */

        int k1= 0;
        int k2=0;
        int k3=0;

        System.out.println(k1>0 && k2>0 && k3>0 && k1==k2 && k2==k3 ? "eşkenar ucgen" : "eşkenar değil");

        //kull 2 sayı alın ve buyuk olmayan sayıyı yazdırın.

        int sayi1=10;
        int sayi2=11;

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);



    }
}
