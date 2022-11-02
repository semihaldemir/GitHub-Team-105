package ders15_overloading_whileloop;

import com.sun.source.tree.WhileLoopTree;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // 2 basamaklı sayıları aralarında bir boşluk olacak şekilde yan
        //yana yazdırın

        for (int i = 10; i <=99 ; i++) {
            System.out.print(i + " ");
        }
        // while loop ile yaparsak
        System.out.println("");
        int a=10;
        while (a<100){
            System.out.print(a+" ");
            a++;
        }
        }
    }

