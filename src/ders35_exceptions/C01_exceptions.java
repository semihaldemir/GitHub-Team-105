package ders35_exceptions;

import java.util.Scanner;

public class C01_exceptions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayı girin");
        int girilensayi= scan.nextInt();
        System.out.print("girdiğiniz sayının karesi: ");
        System.out.println(girilensayi*girilensayi);
    }



}
