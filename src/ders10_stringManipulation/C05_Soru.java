package ders10_stringManipulation;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        mail kontrolu yapan bir program hazırlayın
        1- mail @ işareti içermiyorsa "gecersiz mail"
        2- @gmail.com ile içermiyorsa "gmail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazım hatası"
         */

        String mail="smhaldmr@gmail.com";

        if (!mail.contains("@")){
            System.out.println("geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("yazım hatası");
        }else {
            System.out.println("email başarı ile kaydedildi");
        }

    }







    }

