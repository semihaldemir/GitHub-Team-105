package ders03_datacastingWrapper;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="java co guzel";

        // primitiv data turleri sadece değer barındırırlar hazır metodları yoktur
        //javaya yapılan alepler sonucunda java rimitiv data turleri ile bazı hazır koları kll içinwrapper classlar luştrmşur
        // rapper casla primitie dataturlerindeki değerleriaırlar ancak metodları da vardır.

        char krk='b';

        Character krkWrapper='c';

        System.out.println(Character.isLetter('5'));

        System.out.println(Character.isDigit('7'));

        String str1 = "123";

        String str2 = "12";

        System.out.println(str1+str2);

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

    }
}
