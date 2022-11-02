package ders14_methodOlusturma;

public class C03_StringTersecevirme {
    public static void main(String[] args) {
        //terse çevir

        String input="java kod yazdıkça öğrenilir";

        System.out.println(tersecevirmeMetodu(input));

    }

    public static String tersecevirmeMetodu (String input){

        String tersstr="";
        for (int i = input.length()-1; i >=0 ; i--) {

            tersstr=tersstr+input.charAt(i);
        }
        return tersstr;
    }
}
