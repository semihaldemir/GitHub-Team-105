package ders12_forLoops;

public class C03_Faktoryel {
    public static void main(String[] args) {

        // kull verdği sayıın faktoriyelin bulun

        int sayi=10;

        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriyel=faktoriyel*i;
        }
        System.out.print(faktoriyel);

        System.out.println();

        // 1'den 100'e kadar olan sayıları toplayın

        int toplam=0;

        for (int i = 1; i <=100 ; i++) {
            toplam=toplam+i;
        }

        System.out.println(toplam);



    }
}
