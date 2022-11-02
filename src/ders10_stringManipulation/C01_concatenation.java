package ders10_stringManipulation;

public class C01_concatenation {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "Güzeldir";
        boolean bl=true;
        int sayi= 28;
        double dbl = 3.54;

        System.out.println(str1+bl+sayi); //Javatrue28

        //String dışındaki data turlerinde toplama yapmamıza izin vermeyebilir.

        System.out.println(sayi+dbl); //31.54

        //System.out.println(str1.concat(bl));
        //concat() sadece String variable ları birleştirmek için kullanılır.
        System.out.println(str1.concat(" ").concat(str2));

    }
}
