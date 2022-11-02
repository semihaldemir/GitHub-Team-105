package ders17_scope;

public class C02_ClassLevelVariables {

    // class level variablelar methodların dışında oluşturulur
    //genel kullanım en üstte oluşturulmalıdır

    static String hastaneismi="yıldız hastanesi";
    static  int hastasayisi=23548; //bütün objeler için geçerli olduğu için static
    static String bashekimismi;
    String personelIsmi;
    String personelTelefonu;
    int personelYasi;

    public static void main(String[] args) {
        System.out.println(hastaneismi);
        System.out.println(bashekimismi);
        //System.out.println(personelIsmi);// static olmadığı için static main method dan kullanılamaz
        //class variable lar değer atamadan da kullanılabilir. local variable dan farkı
        // değer atanmamışsa defoult olarak
        // sayısal variable'lar:0
        // boolean:false
        // char:''
        // objeler (string) dahil:null
    }

    public static void method1(){
        System.out.println(hastasayisi);
        hastasayisi++;
        //System.out.println(personelIsmi);
    }

    public void method2(){
        System.out.println(hastaneismi);
        hastasayisi++;
        System.out.println(personelIsmi);
        System.out.println(personelYasi);
    }

}
