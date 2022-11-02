package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {

/*
        for (int i = 0; i < -10; i++) {
            System.out.print(i);
            */
        //sonsuz loop
// ilk değer için bitiş sart true olmuyorsa
        //for bady!si hiç devreye girmez
        for (int i = 0; i > 10; i++) {

        }

        //bir loop'u sonunu beklemeden bitirmek istersek
        // ornek: kull verdiği bir sayının asal sayı olup olmadığını bulun
        //asalsayı 1 ve kendisi dışında hiçbir sayıya bolunmez

        int sayi=103;
        boolean asalmi=false;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asalmi=true;
                break;
        }

        }

        if (asalmi=false){
            System.out.println("asal sayı");
        }else {
            System.out.println("asal sayı değil");
        }

    }
}
