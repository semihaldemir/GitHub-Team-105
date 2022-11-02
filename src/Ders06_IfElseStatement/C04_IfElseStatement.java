package Ders06_IfElseStatement;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfenbir karakter giriniz" );
        char krk=scan.next().charAt(0);

        if (krk>='A' && krk <='Z') {
            System.out.println("buyuk harf");
        } else {
            System.out.println("buyuk harf değil");
        }









    }
}
