package ders26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        // bir metod oluşturalım
        // ve metodta listteki sayıları 5 artıralım
        // ve metodda listenin son halini yazdıralım

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleribesartir(sayilar);
        elementleribesartir(sayilar);
        elementleribesartir(sayilar);

        System.out.println("method call sonrası : " + sayilar);

    }
    public static void elementleribesartir(List<Integer> sayilar){

        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i, sayilar.get(i)+5);
        }
        System.out.println(sayilar);
    }
}
