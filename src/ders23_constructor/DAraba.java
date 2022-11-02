package ders23_constructor;

public class DAraba {
    @Override
    public String toString() {
        return "Araba Özellikleri:" +
                "\nMarka = " + marka +
                "\nModel = " + model +
                "\nYakit = " + yakit +
                "\nYil = " + yil +
                "\nFiyat = " + fiyat ;

    }
// bir proje oluşturulurken tüm classlarda main metod olmasına gerek yoktur
    // coğu class obje oluşturularak kullanılmak üzere hazırlanmış depolardır
    // biz de bu classı araba objeleri için bir depo olarak dizayn edelim

    // her class oluşturulduğunda java o klasta obje oluşturulabilmesi için
    // defoult bir constructor oluşturur
    // bu defoult construtor parametresizdir ve bize standart bir obje oluşturur

    String marka="Marka Belirtilmedi";
    String model="Model Belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public int maxHiz (String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        }else if (yakit.equalsIgnoreCase("elektrikli")){
            maxHiz=180;
        }return maxHiz;
    }
}
