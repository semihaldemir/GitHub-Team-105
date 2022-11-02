package Ders06_IfElseStatement;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yaşınızı giriniz");
        double yas= scan.nextInt();

        if (yas>65){
            System.out.println("yaşınız emeklilik için yeterli");
        }else {
            System.out.println("emekli olmak için " + (65 - yas) + " sene daha çalışmalısın");
        }




    }
}
