package ders41_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullanarak bu listeden 15 ile 35 arasındaki sayıları silin:

        Iterator it1= sayilar.iterator();
        Integer element;
        while (it1.hasNext()){
             element=(Integer) it1.next();
            if (element>15 && element<35){
                it1.remove();
            }
        }
        System.out.println(sayilar);

        sayilar.add(20);
        sayilar.add(30);

        // tüm elementleri iterator yardımıyla silelim
        Iterator it2= sayilar.iterator(); // listenin en başına ıteratoru koyar

        it2.next(); // önce bir yana kayması lazım
        it2.remove(); // şimdi ilk elemanı siler

        it2.next(); // şimdi bir yana daha kaydı
        it2.remove(); // şimdi ikinci elemanı da siler

        while (it2.hasNext()){ // bu while loop ile bütün listeyi silebilirsin
            it2.next();
            it2.remove();
        }
        System.out.println(sayilar); // boş liste gelir []
    }
}
