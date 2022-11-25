package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {
        // ogrenciler mapinde şubesi H olan öğrencilerin isim soyisim ve sınıflarını yazdıralım

        Map<Integer, String> ogrenciMap=MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}
         */

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet(); // bir mapteki keyleri set olarak döndürür

        Collection<String> ogrenciValueCollection = ogrenciMap.values(); // Bir map'teki tüm value'ları bize
        /*
        [Ali-Can-10-H-MF,
        Veli-Cem-11-M-Soz,
        Ali-Cem-11-H-TM,
        Ayse-Can-10-H-MF,
        Ayse-Cem-11-M-TM,
        Fatma-Han-10-K-Soz]
         */
        /*
        Normalde bilgiler arasına Java "," kullanır
        biz de virgül kullanabiliriz ancak bu durumda value Collection'ının kaç elemanlı olduğuna dikkat etmemiz gerekir
        virgülle ayrılmış çok fazla element olbilir.
        fakat valuelerin bir bütün olarak TEK BİR STRİNG  olduğunu unutmamalıyız
         */
        System.out.println(ogrenciValueCollection);
    }
}
