package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>();

        ll1.add("A");
        ll1.add("T");

        /*LinkedList 3 tane interface'i implament etmiştir
         1- List , 2- Queue , 3- Deque interface'leri
         Dolayısıyla bu interface'lerden sonra gelen ilk concrete class oldugundan
         bu interface'deki tum abstract method'ları override etmıstır
         LinkedList olusturulurken secılen daha turune gore bu 3
         ınterface'den birinin ozelıklerını alabılır
           veya data turu LinkedList seçilirse ,   interface'in özelliklerini de toptan alır
         */
        List<String> ll2=new LinkedList<>();

        // daha önceden arraylist oluştururken list inrerface ini data türü olark kullandığımızdan
        // bu şeklde oluşturulan Linkedlist'lerin özelliklerini biliyoruz

        ll2.add("R");
        ll2.add("Z");
        System.out.println(ll2); // [R, Z]

        ll2.add(0,"A");
        System.out.println(ll2); // [A, R, Z]

        ll2.addAll(2,ll1);
        System.out.println(ll2); // [A, R, A, T, Z] 2. indexe ll1 elemanlarını ekledi

        ll2.set(3,"M");
        System.out.println(ll2); // 3. indexteki T'yi silip M yaptı

        System.out.println(ll2.get(3)); // 3. indexteki elemanı getirdi / M

        System.out.println(ll2.retainAll(ll1)); // true // ll2 de ll1 deki elemanlar kalıyor

        System.out.println(ll2);
        ll2.add("H");
        ll2.add("J");

        System.out.println(ll2.hashCode());

        System.out.println(ll2);
        System.out.println(ll2.subList(2, 4)); // 2 dahil 4 dahil değil getirir
    }
}
