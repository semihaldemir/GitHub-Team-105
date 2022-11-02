package ders04_matematikselislemler_;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {
        //rakamlar toplamı 4 basamaklı

        int input=1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=input %10; //3

        rakamlarToplami=rakamlarToplami+birlerBasamagi; //3
        input=input/10;

        birlerBasamagi=input %10; //5

        rakamlarToplami=rakamlarToplami+birlerBasamagi; //8
        input=input/10;

        birlerBasamagi=input %10; //4

        rakamlarToplami=rakamlarToplami+birlerBasamagi; //12
        input=input/10;

        birlerBasamagi=input %10; //1

        rakamlarToplami=rakamlarToplami+birlerBasamagi; //13
        input=input/10;


        System.out.println("verilen sayinin rakamlar toplamı: "+rakamlarToplami);
    }
}
