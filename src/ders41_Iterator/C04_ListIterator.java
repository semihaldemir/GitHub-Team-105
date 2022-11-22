package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //Soru: iterator kullanarak listenin elementlerini sondan başa doğru yazdırın

        ListIterator lit= sayilar.listIterator();
        // önce iteratoru sona getirelim

        while (lit.hasNext()){
            lit.next();
        } // iterator sona gitti
        // şimdi sondan başa gidelim giderken elementleri yazdıralım

        while (lit.hasPrevious()){
            System.out.print(lit.previous() + " ");
        }

        System.out.println();
        //Soru:  iterator kullanarak listenin tüm elementlerini 5 artırın

        // iteratorun konumunu anlamak için;
        System.out.println(lit.nextIndex()); // bu bize bulunduğun indexin yanındakini verir

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5);// sıradakini obje olarak getirdi. onu Integer'a cast ettik
            // 5 ekleyip set ettik
        }
        System.out.println(sayilar); // [15, 25, 35, 45]

        // Soru : Iterator kullanarak +0'dan küçük elementleri silin

        // Şu anda iterator sonda

        while (lit.hasPrevious()){
            if (40>(Integer) lit.previous()){ // geri doğru getirdik gelenleri sildik
                lit.remove();
            }
        }
        System.out.println(sayilar);
    }
}
