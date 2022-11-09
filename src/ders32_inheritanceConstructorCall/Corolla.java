package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota{

    Corolla(int pc){
        super(5);
        System.out.println("parametreli corolla constructor");
    }
    Corolla(){

    }

    Corolla(String str){
        this();
        System.out.println("String parametreli Corolla Constructor");
    }

    public static void main(String[] args) {

        Corolla corolla3=new Corolla("ilker");
        //parametresiz araba constructor
        //parametresiz Toyota Constructor
        //String parametreli Corolla Constructor

        System.out.println("===========");
        Corolla corolla1=new Corolla();
        //parametresiz araba constructor
        //parametresiz Toyota Constructor
        System.out.println("=================");

        Corolla corolla2=new Corolla(3);
        //parametresiz araba constructor
        //Parametreli Toyota Constructor
        //parametreli corolla constructor

    }


}
