package ders23_constructor;

public class HAraba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    // class adıyla aynı olacak
    public HAraba (String mrk, String mdl, String ykt, int yl, int fyt){
        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;
    }

    public HAraba (String mrk, String mdl, int yl){
        // istersek parametreleri azaltarak da cons. oluşturabiliriz
        marka=mrk;
        model=mdl;
        yil=yl;
    }

    public HAraba(){
        // görünür durumdaki parametresiz cons.
        // defoult cons. değildir
        // defoult cons.'ın body si de boş olur
        // ancak parametresiz cons da body'e kod yazılabilir

        // parametresiz cons ın body'sinde kod yoksa
        // defoult cons ile aynı işlevi görür
        // ama yine de görünür durumdaysa  defoult cons. denmez
    }

    // Biz gözle görünür bir Constructor oluşturduğumuzda
    // java default constructoru siler
    // bu durumda daha önce oluşturulmuş olan objelerin sorun olmaması için
    // classa parametresiz bir constructor eklememiz faydalı olur




    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat;
    }

    public int maxHiz(String yakit) {
        int maxHiz = 120;
        if (yakit.equalsIgnoreCase("dizel")) {
            maxHiz = 200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz = 230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz = 180;
        }
        return maxHiz;
    }
}
