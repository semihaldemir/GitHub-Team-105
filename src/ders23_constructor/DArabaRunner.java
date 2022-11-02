package ders23_constructor;

public class DArabaRunner {
    public static void main(String[] args) {

        DAraba arb1=new DAraba();

        System.out.println(arb1.marka); // Marka Belirtilmedi
        System.out.println(arb1.model); // Model Belirtilmedi
        System.out.println(arb1.yakit); // null
        System.out.println(arb1.yil); // 0
        System.out.println(arb1.fiyat); // 0

        arb1.marka="Tofaş";
        arb1.model="Kartal";
        arb1.yakit="Benzin";
        arb1.yil=1991;
        arb1.fiyat=50000;
        arb1.maxHiz(arb1.yakit);

        System.out.println(arb1.marka); // Tofaş
        System.out.println(arb1.model); // Kartal
        System.out.println(arb1.yakit); // Benzin
        System.out.println(arb1.yil); // 1991
        System.out.println(arb1.fiyat); // 50000
        System.out.println(arb1.maxHiz(arb1.yakit)); // 230

        DAraba arb2= new DAraba();

        // arb2'nin özelliklerini yazdırmak istesek

        System.out.println("Markası : " + arb2.marka);
        System.out.println("Model : " + arb2.model);
        System.out.println("Yakıt : " + arb2.yakit);
        System.out.println("Yıl : " + arb2.yil);
        System.out.println("Fiyat : " + arb2.fiyat);

        DAraba arb3=new DAraba();
        System.out.println(arb3);
        System.out.println(arb1);

        DAraba arb4= new DAraba();
        System.out.println(arb4);

    }
}
