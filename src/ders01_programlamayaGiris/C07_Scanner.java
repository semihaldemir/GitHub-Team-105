package ders01_programlamayaGiris;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adınızı giriniz");
        //.next- sadece ilk space e kadar olan kısmı alır. .nexline ise o satırdaki tüm bilgiyi alır.
        String isim=scan.nextLine();
        System.out.println("lutfensoy isminizi yazınız");
        String soyisim=scan.nextLine();
        System.out.println("lutfen yaşınızı giriniz");
        double yas=scan.nextDouble();

        System.out.println("ısmınız: "+isim+"\nsoyisminiz :" +soyisim + "\nyasınız"+yas+ "\nkaydınız başarıyla tamamlanmıştır");

    }
}
