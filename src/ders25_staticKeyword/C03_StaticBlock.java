package ders25_staticKeyword;

public class C03_StaticBlock {

    static {
        System.out.println("2. static block çalıştı"); // üstteki önce çalışır
    }

    static {
        System.out.println("1. static block çalıştı"); // main methoddan bile önce çalışır
                                                        // main methoddan sonra yazılsa bile önce çalışır
    }

    public static void main(String[] args) {
        System.out.println("main method çalıştı");
    }
}
