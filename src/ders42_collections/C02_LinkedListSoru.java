package ders42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {
    /*
    Soru : Kullanicidan deger alarak iki String liste olusturun.
    Kullanici deger girmeyi birakmak icin 0’a basmalidir.
 Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
 liste1 : …….
 liste2 : …….
 ortak elementler : …….
     */
    public static void main(String[] args) {

        System.out.println("önce list 1'i oluşturalım");
        List<String> list1=kullanicidanAlarakListOlustur();
        System.out.println("şimdi ikinci lkisteyi oluşturalım");
        List<String> list2=kullanicidanAlarakListOlustur();

        System.out.println("Liste 1: " + list1);
        System.out.println("Liste 2: " + list2);
        list1.retainAll(list2);

        System.out.println("Ortak elemanlar : " + list1);

    }

    public static List<String> kullanicidanAlarakListOlustur(){
        List<String> isimListesi=new LinkedList<>();
        Scanner sca=new Scanner(System.in);

        String isim="";
        while (!isim.equalsIgnoreCase("0")){
            System.out.println("Listeye eklemek için isim giriniz.\nBitirmek için 0'a basınız");
            isim= sca.nextLine();
            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }

        }return isimListesi;
    }

}
