package ders26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {

        // bir method oluşturalım metodda yeni bir liste oluşturun
        // listeye sayılar listesindeki değerlerin 5 fazlasını element olarak atayın
        // sonra sayılar listesine değer olarak yeni listi atayın ve sayılar listini yazdırın

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

        System.out.println("method calldan sonra methodda sayılar list : " + sayilar);


    }
    public static void yeniListDegeriAta (List<Integer> sayilar){
        List<Integer> yeniList= new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            yeniList.add(sayilar.get(i)+5);
        }
        sayilar=yeniList;
        System.out.println("metotda sayılar listesinin son hali : " + sayilar);

    }
}
