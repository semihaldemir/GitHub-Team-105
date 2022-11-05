package ders28_varargs_Stringbuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        topla(5,6); // 11
        topla(5,3,8); //16
        topla(8,6,4,5); //23
        topla(5,8,74,65,1,58,4,56,4,1,2,2,1,2); // 283

        //bir metodda parametre sayısını sınırlandırmak istemezsek
        //standart bir variable yerine varargs kullanırız

        // varargs datatürünün yanına ... konularak deklare edilir
        // sayısı belli olmayan int parametreler alan bir arraydir


    }

    private static void topla(int... sayilar ) {
        int toplamSonucu=0;

        for (int each: sayilar
             ) {
            toplamSonucu+=each;
        }
        System.out.println("girilen sayıların toplamı: " + toplamSonucu);
    }

}
