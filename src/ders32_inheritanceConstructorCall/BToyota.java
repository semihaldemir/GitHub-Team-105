package ders32_inheritanceConstructorCall;

public class BToyota extends Araba{
    BToyota(){
        System.out.println("parametresiz Toyota Constructor");
    }

    BToyota(int pt){
        System.out.println("Parametreli Toyota Constructor");
    }

    BToyota(String pt2){
        super("mehmet");
        System.out.println("String parametreli toyota Constructor");
    }
}
