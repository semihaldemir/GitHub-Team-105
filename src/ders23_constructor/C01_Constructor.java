package ders23_constructor;

import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {


        // Scanner clasındaki metod ve variableları kullanmak için scan objesini oluştururuz
             Scanner      scan     =    new                                   Scanner(System.in);
        // class adi    obje ismi      obje oluşturmak için kullanırız        Scanner Constructor'ı

        scan.nextInt();

        String str= new String("java candır");
        String str2="java ne güzel";

        str.toLowerCase();


    }
    public static void C01_Constructor () {
        // method isimleri küçük harfle başlar
        // class ismi ile aynı olmaması tavsiye edilir
        // retur type varsa metodtur. costructor olamaz
    }
}
