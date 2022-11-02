package Ders06_IfElseStatement;

public class C09_IfElseStatement {
    public static void main(String[] args) {

        //kull tam sayı al
        //sayı negatifse "Gecersiz Say"
        //tek basamaklı ise "Rakam"
        //iki bas ise" iki Basamaklı Sayı"
        //bunun dışındaki sayılar için "Büyük Sayı" yazdırsın

        int sayi=-1;

        if (sayi<0){
            System.out.println("geçersiz sayı");
        } else if (sayi<10) {
            System.out.println("Rakam");
            } else if (sayi<100) {
            System.out.println("iki basamaklı sayı");
            }else {
            System.out.println("büyük sayı");
        }


    }
}
