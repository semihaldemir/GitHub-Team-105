package ders40_Interfaces;

public interface I01_Interface {

    // Interfaceler özel yapı olduklarından yazılsa da yazılmasa da tüm variablelar
    // public static ve final'dır

    String MESAJ="Hello Interface";

    static int SAYI=20;
    public static boolean GUZEL_MI=true;
    public static final int SAYI2=30;

    // gri yaptı gereksiz diyor.


    // Aynı şekilde tüm methodlar public ve abstract'tır
    Void method1();
    abstract int method2();
    public abstract String method3();
}
