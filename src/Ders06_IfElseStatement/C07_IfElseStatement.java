package Ders06_IfElseStatement;

import java.util.Scanner;

public class C07_IfElseStatement {
    public static void main(String[] args) {
//Soru 5- Kullanicidan bir harf isteyin,
// girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
// yoksa girilen harfi yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfenbir karakter giriniz" );
        char krk=scan.next().charAt(0);

        if (krk>='a' && krk<='z'){
            //küçük harf girildi demektir
            System.out.println((char) (krk-32));
        }else {
            //kucuk harf değil demektir
            System.out.println(krk);
        }







    }
}
