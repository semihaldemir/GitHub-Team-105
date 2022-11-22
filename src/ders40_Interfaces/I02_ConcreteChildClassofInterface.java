package ders40_Interfaces;

public class I02_ConcreteChildClassofInterface implements I01_Interface{

    // bir classı bir interfacein childı yapmak için implements keyword kullanılır

    public static void main(String[] args) {

        System.out.println(MESAJ);

        //sayi=40;
        // yazılmasa da interface deki variable final olduğu için atama yaptırmıyor

        System.out.println(Integer.MAX_VALUE);
        // normalde variable isimleri küçük harfke başlar
        // java da ortak kabul olarak static ve final olarak
        // işaretlenen variable isimleri tamamen büyük harf ile yazılır
        System.out.println(Math.PI); // gibi
    }

    @Override
    public Void method1() {
        return null;
    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
