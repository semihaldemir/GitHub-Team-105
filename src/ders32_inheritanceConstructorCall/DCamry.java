package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota{

    DCamry(String pc){
        super("Deniz");
        System.out.println("String parametreli Camry");
    }
    // parametreli araba constructor
    //String parametreli toyota Constructor
    //String parametreli Camry
    DCamry(){

    }


    public static void main(String[] args) {
        // eğer kullanılan argumente uygun bir cons.
        // parent classda yoksa CTE olur
        DCamry camry2= new DCamry("celal");


        System.out.println("===============");
        DCamry camry1=new DCamry();
        //parametresiz araba constructor
        //parametresiz Toyota Constructor
    }
}
