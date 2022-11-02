package ders10_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir cumle ve bir metin alın
        cumlede metnin durumuna göre
        1- cumle metni içermiyor
        2- cumle metni sadece 1 kere içeriyor
        3- cumle metni birden fazla içeriyor
        secenklerinden uygun olanı yazdırın
         */

        String str="beni boyle sev seveceksen";
        String str2="sev";

        if (!str.contains(str2)){
            System.out.println("cumle metni içermiyor");
        } else {
            int ilkindex=str.indexOf(str2);

            int ikinciindex= str.indexOf(str2,ilkindex+1);

            if (ikinciindex==-1){
                System.out.println("cumle metni sadece 1 kere içeriyor");
            }else {
                System.out.println("cumle metni birden fazla içeriyor");
            }
        }





    }
}
