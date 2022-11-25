package ders45_maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {

        // verilen bir cümlede kullanılan her bir harfi
        // ve o harfin kullanım miktarını
        // A=5, B=3 ... gibi yazdırın

        String str= "Javayı balonu patlatmadan bitirelim";
        // J=1, a=7, v=1, ...

        String[] harflerArr=str.split("");

        Map<String, Integer> kullanimMiktarlari=new TreeMap<>();
        int sayac=1;
        // 1- tüm harfleri sırası ile ele alacağız

        for (int i = 0; i < harflerArr.length; i++) {

            // 2- ele aldığımız harfin daha önce map'e eklenip eklenmediğini kontrol edelim
            if (kullanimMiktarlari.containsKey(harflerArr[i])){
                continue;
            }else {
                // kod buraya geldiyse o harf henüz map'e eklenmemiştir
                // o zaman bu harfin kullanım miktarını bulmalıyız
                for (int j = i+1; j < harflerArr.length; j++) {
                    if (harflerArr[j].equals(harflerArr[i])){
                        sayac++;
                    }
                }
            }
            // sayma işlemi bitti, Key ve Value'yu map'e ekleyelim
            kullanimMiktarlari.put(harflerArr[i],sayac);
            sayac=1;
        }

        System.out.println(kullanimMiktarlari);
    }
}
