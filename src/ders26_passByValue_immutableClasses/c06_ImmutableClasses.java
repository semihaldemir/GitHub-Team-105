package ders26_passByValue_immutableClasses;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class c06_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java Güzeldir";

        System.out.println(str.toUpperCase()); // JAVA GUZELDİR

        System.out.println(str); // java guzeldir

        str.toLowerCase();

        System.out.println(str); // Java Güzeldir

        // string immutable olduğu için method ile yapılan değişiklikler String'i kalıcı değiştirmez

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);

        System.out.println(harfler);

        // List ve Array mutable oldukları için metod ile yapıln değişiklikler kalıcı olur

    }
}
