package ders10_stringManipulation;

public class C09_soru {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir cumle ve bir metin alın
        cumlede metnin durumuna göre
        1- cumle metni içermiyor
        2- cumle metni sadece 1 kere içeriyor
        3- cumle metni birden fazla içeriyor
        secenklerinden uygun olanı yazdırın
         */

        String cumle="Java çok güzeldir çok";
        String metin="çok";

        int ilkindex=cumle.indexOf(metin);
        int sonindex=cumle.lastIndexOf(metin);

        if (ilkindex==-1){
            System.out.println("cumle metni içermiyor");
        } else if (ilkindex==sonindex) {
            System.out.println("cümle metni sadece bir kere içeriyor");
        }else {
            System.out.println("cümle metni birden fazla içeriyor");
        }


    }
}
