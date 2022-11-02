package Ders07_NestedIfElseStatements;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        int urunadedi = 5;
        boolean kartvarmi = true;
        double listefiyati = 12.5;
        double toplamfiyat = 0;

        if (kartvarmi == true && urunadedi >= 10) {
            toplamfiyat = listefiyati * urunadedi * 0.8;
            System.out.println("%20 indirimli fiyat: " + toplamfiyat);
        } else if (kartvarmi == true && urunadedi < 10 && urunadedi > 0) {
            toplamfiyat = listefiyati * urunadedi * 0.85;
            System.out.println("%15 indirimli fiyat: " + toplamfiyat);
        } else if (kartvarmi == false && urunadedi >= 10) {
            toplamfiyat = listefiyati * urunadedi * 0.85;
            System.out.println("%15 indirimli fiyat: " + toplamfiyat);
        } else if (kartvarmi == false && urunadedi < 10 && urunadedi > 0) {
            toplamfiyat = listefiyati * urunadedi * 0.9;
            System.out.println("%10 indirimli fiyat: " + toplamfiyat);
        } else {
            System.out.println("gecersiz");

        }
    }
}
