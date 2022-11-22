package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        // Java Collections içerisindeki bazı classlar index desteklemez
        // Bu durumda index kullanmadan collection içerisindeki tüm elementlere uşlaşabilmek ve
        // onları update edebilmek için farklı ihtiyaçlarımız olabilir

        // List<> index yapısını desteklediği için böyle bir ihtiyaç yoktur
        // ancak bu günlük index kullanmadan List elementlerine ulaşmaya
        // ve onları update etmeye çalışalım


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        // index kullanmadan List'in tüm elementlerini yazdırın

        for (Integer each: sayilar
             ) {
            System.out.print(each+" ");
        }

        System.out.println();

        // index kullanmadan Listin elementlerini bir'er artırın
        // index kullanmadan 25'den büyük sayıları List'ten silin

        for (Integer each:sayilar
             ) {
            System.out.print(each+1+" ");// atama yapmadık sadece bir fazlasını yazdırdık
        }
        System.out.println();

        for (Integer each:sayilar
             ) {
            each+=1;
            System.out.print(each+" ");  // yine aatama yapmadık sayılar aynı kaldı
        }
            /* Index kullanmadan LİST'in elemanlarını kalıcı olarak değiştirmek mümkün olmadı :/
        Java bunun için Iterator İnterface'i oluşturmuştur.
            */


    }
}
