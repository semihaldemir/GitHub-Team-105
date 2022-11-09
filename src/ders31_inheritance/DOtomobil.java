package ders31_inheritance;

public class DOtomobil extends BinekArac {
    public static void main(String[] args) {

        DOtomobil oto1=new DOtomobil();
        System.out.println(oto1.marka);

        // inheritance sayesind ebir child class oluşturduğumuzda
        // yeni hiçbir variable veyamethod oluşturmadan
        // parent classlardaki tüm özellikleri almış oluruz
        // child class da parent'dan gelen özellikleri
        // update edebilir veya yeni özellikler ekleyebiliriz
    }


}
