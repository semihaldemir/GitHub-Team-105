package Ders06_IfElseStatement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C10_IfElseStatement {
    public static void main(String[] args) {

        char cinsiyet= 'k';
        int yas=60;

        if (cinsiyet=='e' && yas>=65){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='e' && yas<65 && yas>15) {
            System.out.println("emekli olmak için "+(65-yas)+" sene calışmalısın");
        } else if (cinsiyet=='k'&&yas>=60) {
            System.out.println("emekli olabilirsin");
            } else if (cinsiyet=='k'&&yas<60 && yas>15) {
            System.out.println("emekli olmak için "+(60-yas)+" sene calışmalısın");
        }else {
            System.out.println("gecersiz giriş");
        }


    }
}
