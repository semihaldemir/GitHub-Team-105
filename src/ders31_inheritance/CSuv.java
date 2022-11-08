package ders31_inheritance;

public class CSuv extends BinekArac{

    public static void main(String[] args) {

        CSuv suv1=new CSuv();
        System.out.println(suv1.marka); // Binek araçların markası vardır
        System.out.println(suv1.model); // Binek araçların modeli olur
        System.out.println(suv1.motor); // Tum araçlar motor kullanır
        System.out.println(suv1.plaka); // Tum araçların plakası olur
        System.out.println(suv1.yakit); // Araçlar farklı yakıtlar kullanır
        System.out.println(suv1.yil);   // 1900
        suv1.hiz("benzin"); // Binek araçların hızı modele göre değişir
        suv1.teker(); // binek araçların 4 tekeri olur

        CSuv suv2=new CSuv();
        suv2.marka="Toyota";
        suv2.model="RAV4";
        suv2.motor="2,0";
        suv2.plaka="06 ANK 06";
        suv2.yakit="Benzin";
        suv2.yil=2020;
        suv2.hiz(suv2.yakit);
    }

    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV'lar en fazla 300 KM yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel SUV'lar max 260 km hız yapar");
        } else if (yakit.equalsIgnoreCase("Hibrit")) {
            System.out.println("Hibrit SUV'lar max 220 km hız yapar");
        }else {
            System.out.println("Yakıt belli değil hız soyleyemem");
        }
    }
}
