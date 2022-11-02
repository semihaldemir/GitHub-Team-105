package ders13_nestedForLoop_MethodOlus;

public class C02_StringTersineCev {
    public static void main(String[] args) {
        /*
        Soru 10 (interview)-
        Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
         */

        String input="Java her geçen gün güzelleşiyor";
        String tersinput="";

        for (int i = input.length()-1; i >= 0 ; i--) {

            tersinput += input.substring(i,i+1);

        }

        System.out.println("ters hali: "+ tersinput);
    }
}
