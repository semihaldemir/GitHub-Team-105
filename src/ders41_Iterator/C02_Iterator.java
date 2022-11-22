package ders41_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        Iterator it1 = sayilar.listIterator();

        // tüm elementleri iterator kullanarak yazdıralım

        System.out.println(it1.hasNext()); // yanında eleman var mı?
        System.out.println(it1.next()); // 10- yana geç, geçerken de geçtiğin elemanı getir

        System.out.println(it1.hasNext());// true
        it1.next(); // 20

        System.out.println("===============");
        while (it1.hasNext()) {
            System.out.println(it1.next()); // iteratoru nerde bıraktıysak ordan devam eder
        }
        // baştan itibaren yazdırmak isterseniz yeni bir iterator oluşturmanız gerekir.

        Iterator it2 = sayilar.iterator();

        System.out.println("===============");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }

}
