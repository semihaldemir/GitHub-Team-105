package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //10 11 12 sayılarını toplayan bir while loop oluşturalım

        int sayi=10;
        int toplam=0;

        while (sayi<=12){
            toplam+=sayi;
            sayi++;
        }
        // while loop ta önce konrol sonra işlem yapılır
        /*
        while loop da 2 prob oluşabilir
        1- önce kontrol edip sonra işlem yaptığımız için body de
        bir kere daha kontrol etmemiz gerekebilir
        2- yapılan işlem sayısından 1 fazla while bitiş şartı kontrol edilir
        3- while loop oncesinde değerleri kontrol edeceğimiz bir variable olusturuyorsak
        ona yapacağımız atamayı dikkatli yapmamız gerekir
        yanlıs değer atamak while loop un calışmamasına neden olabilir

         */


    }
}
