package ders13_nestedForLoop_MethodOlus;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        //aşağıdaki şekli oluştur

        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        */

        for (int i = 1; i <=4 ; i++) { //satır

            for (int j = 1; j <=6 ; j++) {// sütun
                System.out.print("* ");

            }
            System.out.println("");// iç loop bitince alt satıra geç

        }

    }
}
