package ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface{
    // eğer bir interface i başka bir interfacin child'ı
    // yapmak isterseniz extends keyword kullanılır

    // bir interface concrete class'ı İNHERİT EDEMEZ


    @Override
    Void method1();
    // interface bir child parent interface deki abstract metodu override edebilir
    // ama ikisinin de body si olmadığından bu işlemin bir anlamı yoktur.

    int method4();
    boolean method5();
    // yeni methodlar koyulabilir
}
