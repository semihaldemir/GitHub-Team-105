package ders04_matematikselislemler_;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {
        int a=10;
        // a variableın değerini yazdırıp sonra a'nın değerini 1 artırın

        System.out.println("a: "+a);
        a++;

        // a variableın değerini 1 artırıp sonra yazdırın.

        int b=10;

        b++;
        System.out.println("b:"+b); // 11

        // c variableın değerini yazdırıp sonra a'nın değerini 1 artırın

        int c=10;

        System.out.println("c:"+c++);

        // d variableın değerini 1 artırıp sonra yazdırın.

        int d=10;

        System.out.println("d: "+ ++d );
        /*
        c++ veya ++d yi yazdırma veya atama işleminde kullanırsanız
        c++ post increment denir o satır için önce işlemi yapar sonra artırma yapar
        ++d ise pre increment denir önce artırma yapıp sonra artırma yapar

        işlemin olduğu satırın bir alt satırına geçildiğinde c ve d de 1 artmıştır.
         */



    }
}
