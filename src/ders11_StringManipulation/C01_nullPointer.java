package ders11_StringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1="";
        //str1'e değer atanmıştır.
        System.out.println(str1);//hiçlik yazdırır
        System.out.println(str1.concat("Java"));// Java

        String str2;
        //str2 oluşturuldu ama değer atanmadı
        //System.out.println(str2); değer atanmadığı için yazdırılamaz.
        //System.out.println(str2.concat("java")); değer atanmadığı için metodla kullanılamaz
        //değer atandıktan sonra kullanılabilir

        String str3=null;// str3'e değer atanmamıştır
        // null pointer ile javaya değer atamadığımızın farkında olduğumuzu soyluyoruz

        System.out.println(str3); // null işaretlendiğini yazdırır

        //System.out.println(str3.concat("java")); // altını çizmez ama NullPointerException hatası verir
        // Null olarak işaretliyoruz, kodun çalışmasını sağlıyoruz

        System.out.println(str3+"java");


    }
}
