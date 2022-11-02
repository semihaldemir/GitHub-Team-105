package ders0_concatenation_operatorler;

public class C01_Concetanetion {
    public static void main(String[] args) {
        // sadece aşağıdaverilen varablelları kull istenen değ yazdır

        String s1="Java";
        String s2="Güzeldir";
        String s3="";
        String s4=" ";

        int sayi1= 4;
        int sayi2= 5;

        //Java güzeldir

        System.out.println(s1+s4+s2+(sayi1+sayi2));

        //java güzeldir 12

        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));
        //7Java Güzeldir

        System.out.println(sayi1+sayi2+s1+s4+s2);
        System.out.println(s3+sayi1+sayi2+s4+s1);

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);





    }
}
