package ders13_nestedForLoop_MethodOlus;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // 1 den 4 e kadar bir çarpım tablosu

        //dış döngü satırları kontrol eder

        for (int i = 1; i <=4 ; i++) {

            // iç döngü her satırda olan değerleri kontrol eder

            for (int j = 1; j <=4 ; j++) {

                System.out.print(i*j+" ");


            }
            // iç döngü bittiğinde javayı alt satıra indirmeliyiz
            System.out.println("");


        }



    }
}
