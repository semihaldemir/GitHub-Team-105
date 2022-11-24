package ders44_maps;

import java.util.HashMap;
import java.util.Map;

public class MapDepo {

    // Ogrenci map oluşturup bize döndüren bir method oluşturun
    public static Map<Integer, String> ornekMapOlustur(){
        Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }

    public static String isimSoyisimYazdir(Map<Integer, String> ogrenciMap, int ogrenciKey) {
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}

        ogrenciKey=105
         */
        String ogrenciValue=ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
        String[] valueArr=ogrenciValue.split("-"); // [Ayse,Can,10,H,MF]
        String isimSoyisim=valueArr[0]+" "+valueArr[1];

        return isimSoyisim;
    }

    public static Map<Integer,String> ogrenciYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {


        // ogrenci key map'te var mı?
        if(ogrenciMap.containsKey(ogrenciKey)){
            // istenen key varsa update edip yeni map'i döndürecez
            String istenenKeyinValuesu=ogrenciMap.get(ogrenciKey);
            String[] istenenKeyValueArr=istenenKeyinValuesu.split("-"); //[Ayşe, Can, 10, H, MF]
            // yeni şube değerini atayalım
            istenenKeyValueArr[3]=yeniSube; // //[Ayşe, Can, 10, K, MF]

            String istenenKeyinYeniValuesu= istenenKeyValueArr[0]+"-"+
                                            istenenKeyValueArr[1]+"-"+
                                            istenenKeyValueArr[2]+"-"+
                                            istenenKeyValueArr[3]+"-"+
                                            istenenKeyValueArr[4];

            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValuesu);
            return ogrenciMap;
        }else {
            // yoksa Map'i aynen döndürecez
            return ogrenciMap;
        }

    }
}
