package ders44_maps;

import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {


        Map<Integer, String> ogrenciMap=MapDepo.ornekMapOlustur();

        ogrenciMap.put(105,"Hasan-Can-11-K-Mf");
        ogrenciMap.put(108,"Hikmet-Han-10-M-TM");

        // eğer mapte olan bir key ile yeni bir değer eklerseniz
        // o key'e ait olan vaşue silinir yeni value geçerli olur

        System.out.println(ogrenciMap);

        // 108 no lu ogrencinin isim ve soy ismini yazdırın

        System.out.println(MapDepo.isimSoyisimYazdir(ogrenciMap, 108));

        // 104 no'lu şubesini K yapın
        // metotda istenen key mapta varsa değiştirip map'i geri döndürelim yoksa
        // hiç bir işlem yapmadan map'i geri döndürelim
        int ogrenciKey=108;
        String yeniSube="K";
        ogrenciMap = MapDepo.ogrenciYeniSubeAta(ogrenciMap,ogrenciKey,yeniSube);
        System.out.println(ogrenciMap);

    }
}
