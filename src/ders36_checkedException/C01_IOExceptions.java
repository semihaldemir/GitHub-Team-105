package ders36_checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis= new FileInputStream("src/ders36_checkedException/Deneme.txt");

        FileOutputStream fos=new FileOutputStream("src/ders36_checkedException/Deneme.txt");

        //java ile bilgisayarımızdaki bir dosyaya ulaşmak istersek
        //FileInputStream class'ından obje oluşturup
        // o obje aracılığıyla dosyayı kullanabiliriz

        // fis olusturuken ulaşmak istediğimiz dosyanın
        // dosya yolunu parametre olarak girmeliyiz

        /*
        shecked exception oluşturma ihtimali olan kodları yazdığımızda java compile time orada bir hata ihtimali olduğunu görür
        ve kodun altını otomatik çizer

        bu durumda krmızı çizgiyi kaldırmak için 2 yöntem vardır
        1- exception'ı try catch bloğu ile handle etmek
        2- Java'ya sorun ihtimalinin farkında olduğumuzu ama kodumuza güvendiğimizi
         ve çalışmaya devam etmesini istediğimizi söylemek
         bunun için method signature'na
         method deklarasyonu ile curly braces arasına throws keyword
      ve beklenen exceptıon turu yazılabilir
         */
    }
}
