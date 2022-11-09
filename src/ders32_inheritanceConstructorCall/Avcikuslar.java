package ders32_inheritanceConstructorCall;

public class Avcikuslar extends FKuslar{

    public static void main(String[] args) {

        Avcikuslar avci1=new Avcikuslar();

        FKuslar avci2=new Avcikuslar();

        EHayvanlar avci3=new Avcikuslar();

        /*
        bir child classda obje oluşturmak için
        child class constructor'ı kullanılır.

        ama data turunu
        o objenin bağlı olduğu class'lardan secebiliriz

        eğer constructor ve data turu farklı seçilirse
        bu durumda class uyesi olan
        variable ve method'lar farklı davranışlar gözterirler
         */
    }
}
