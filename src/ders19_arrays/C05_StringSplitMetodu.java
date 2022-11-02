package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMetodu {
    public static void main(String[] args) {

        String str="Java gercekten cok cok guzel";
        // verilen stringte kactane e harfi olduğunu bulunuz

        String[] eArray= str.split("e"); // [Java g, rc, kt, n cok cok guz, l]
        System.out.println(Arrays.toString(eArray));
        System.out.println(eArray.length); // 5
        System.out.println("Metindeki e sayısı: "+ (eArray.length-1));

        //diğer yöntem

        String[] tumKarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));
        //[J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]

        int sayac=0;
        for (int i = 0; i < tumKarakterlerArr.length; i++) {
            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }

        }
        System.out.println("Metindeki e sayısı: "+ sayac); //Metindeki e sayısı: 4

    }

}
