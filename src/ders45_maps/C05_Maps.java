package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        // ogrenci mapinden numarai isim ve soyisim değerlerini yazdıralım

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(110,"Suleyman-Şah-11-T-Mf");
        ogrenciMap.put(105,"Şule-Karaca-10-L-MF");

        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);

    }
}
