package ders04_matematikselislemler_;

public class C01_dataCasting {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=5;
        System.out.println(sayi1/sayi2);
        //bolunen ve bolen ikiside tamsayıise java sonucun sadece tamsayı kısmınıalır

        double sayi3=6;
        System.out.println(sayi1/sayi3);
        //3,333333333 int/double java geniş alana göre davranır.
    }
}
