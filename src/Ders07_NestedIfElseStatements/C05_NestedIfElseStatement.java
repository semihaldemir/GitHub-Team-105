package Ders07_NestedIfElseStatements;

public class C05_NestedIfElseStatement {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        int urunadedi = 12;
        boolean kartvarmi = false;
        double listefiyati = 12.5;
        double toplamfiyat = 0;
// anadeğişken kart

        if (kartvarmi) {
            //kart var
            if (urunadedi < 0) {
                System.out.println("hatalı urun adedi girişi");
            } else if (urunadedi < 10) {
                toplamfiyat = urunadedi * listefiyati * 0.85;
                System.out.println("%15 indirimli fiyatı: " + toplamfiyat);
            } else {
                toplamfiyat = urunadedi * listefiyati * 0.80;
                System.out.println("%20 indirimli fiyatı: "+ toplamfiyat);
            }


        } else {
            //kart yok
            if (urunadedi < 0) {
                System.out.println("hatalı urun adedi girişi");
            } else if (urunadedi < 10) {
                toplamfiyat = urunadedi * listefiyati * 0.9;
                System.out.println("%15 indirimli fiyatı: " + toplamfiyat);
            } else {
                toplamfiyat = urunadedi * listefiyati * 0.85;
                System.out.println("%15 indirimli fiyatı: "+ toplamfiyat);
            }


        }
    }
}
