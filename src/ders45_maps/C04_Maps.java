package ders45_maps;

import ders44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {


    // ogrenci mapinde numarası verilen sayılar arasında (sınırlar dahil) olanların
    // isim soyisim ve bölümlerini list olarak bize döndüren bir metod oluşturun

    Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();

    ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
    ogrenciMap.put(103,"Hikmet-Sağlam-11-H-Soz");
    int basNo=102;
    int bitNo=120;
    List<String> isimListesi=MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);

        System.out.println(isimListesi);
   }
}
