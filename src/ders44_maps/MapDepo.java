package ders44_maps;

import java.util.*;

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

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {
        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("İsim     Soyisim      Sınıf\n" +
                           "===========================");
        for (String each:valueCollection
             ) {
            // value'yu parçalarına ayır
            String[] valueArr=each.split("-");
            // şube ismini kontrol et
            // istenen şube ise isim, soyisim, sınıf yazdır
            if (valueArr[3].equals(subeAdi)){
                System.out.println(valueArr[0]+" "+valueArr[1]+" "+valueArr[2]);
            }
        }

    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
        // hem KEy hem de value lazım olduğundan Keyset oluşturduk
        // sonra okey uzerinden value'yu map'ten aldık
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // döndüreceğimiz listeyi oluşturalım
        List<String> isimListesi=new ArrayList<>();
        // key değerlerini tek tek elden geçirip
        // istenen aralıkta olanları bulalım

        String value;
        String[] valueArr;
        String istenenIsim;
        for (Integer eachKey:ogrenciKeySeti
             ) {
            if (basNo<=eachKey && eachKey<=bitNo){
                // buraya verilen sınır değerlerine uyan
                // eachKey'ler gelecek

                // sınıra uygun Keyin valuesunu alalım
                value=ogrenciMap.get(eachKey); // 104=Ayse-Can-10-H-MF
                // valueyu parçalara arayalım
                valueArr=value.split("-"); //[Ayşe, Can, 10, K, MF]

                istenenIsim=valueArr[0]+" "+valueArr[1]+" "+valueArr[4];

                //istenen ismi bulduk, bunu listeye ekleyelim
                isimListesi.add(istenenIsim);
            }
        }return  isimListesi;
    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {
        Set<Integer> keySeti=ogrenciMap.keySet();
        String value;
        String[] valueArr;
        for (Integer eachKey:keySeti
             ) {
            value=ogrenciMap.get(eachKey);
            valueArr=value.split("-");

            System.out.println(eachKey+" "+valueArr[0]+" "+valueArr[1]);
        }
    }
}
