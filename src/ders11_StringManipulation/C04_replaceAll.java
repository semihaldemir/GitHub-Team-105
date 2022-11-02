package ders11_StringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        //kull girdiği metinde
        //harf dışında kalan tum karakterleri temizleyen birkod yaın
        //sadece space silinmemeli


        String input="Ja5+va cok 1*guzel";


        input=input.replaceAll("\\d","");
        input=input.replace(" ", "5");
        input=input.replaceAll("\\W","");
        input=input.replace("5"," ");
        System.out.println(input);




    }
}
