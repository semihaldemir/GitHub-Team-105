package ders25_staticKeyword;

public class AHemsire {

    static String hastaneIsmi="yıldız Hastanesi";
    static String hastaneAdresi="Çankaya / Ankara";
    static String bashekimIsmi="Dr Mehmet Yılmaz";

    String personelIsim="İsim Belirtilmedi";
    String personelAdresi="Adres Belirtilmedi";
    String PersonelTelefonu="Telefon Belirtilmedi";

    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", PersonelTelefonu='" + PersonelTelefonu + '\'' +
                "\nhastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ", bashekimIsmi='" + bashekimIsmi + '\'' +

                '}';
    }
}
