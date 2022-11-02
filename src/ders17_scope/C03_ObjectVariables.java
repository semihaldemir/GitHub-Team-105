package ders17_scope;

public class C03_ObjectVariables {

    static String hastaneismi="yıldız hastanesi";
    static  int hastasayisi=23548; //bütün objeler için geçerli olduğu için static
    static String bashekimismi;
    String personelIsmi="isim girilmedi";
    String personelTelefonu="telefon girilmedi";
    int personelYasi;

    /*
    class level variable ların scope u tum classtır.
    statik kelimesi ile işaretlenen variablellara class içerisinde
    her yerden ulaşılabildiği için
    diğer adı class variablesdır

    static kelimesi ile işaretlenmeyen variablelara ise instance variablelar denir
    instance variablelar objelere bağlı olduklarından
    bu variableların diğer adı object variablesdır

     */
    public static void main(String[] args) {

    }
}
