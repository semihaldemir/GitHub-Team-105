package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {
    public static void main(String[] args) {

        //C03 clasındaki instance variablelara nasıl ulaşabiliriz?
        //instance variableların diğer adı obje variablelarıdır
        //instance variablelara obje üzerinden ulasabiliriz


        C03_ObjectVariables personel1= new C03_ObjectVariables();

        System.out.println(personel1.personelIsmi); // isim girilmedi
        System.out.println(personel1.personelYasi); // 0

        personel1.personelIsmi="suleyman";
        personel1.personelYasi=34;
        personel1.personelTelefonu="5666646569";

        System.out.println(personel1.personelIsmi); // suleyman
        System.out.println(personel1.personelYasi); // 34

        C03_ObjectVariables pers2=new C03_ObjectVariables();
        pers2.personelIsmi="LAtife";
        pers2.personelYasi=64;
        pers2.personelTelefonu="674649764";

        System.out.println(personel1.personelIsmi); //suleyman
        System.out.println(pers2.personelIsmi); // latife

        C03_ObjectVariables pers3=new C03_ObjectVariables();

        pers3.personelIsmi="heysem";
        pers3.personelYasi=27;
        pers3.personelTelefonu="3546345645";

        System.out.println(personel1.personelYasi); // 34
        System.out.println(pers2.personelYasi);// 64
        System.out.println(pers3.personelYasi);// 27
    }
}
