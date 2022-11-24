package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("B");//[K, B]
        dq1.addLast("F");
        dq1.addFirst("A"); // [A, K, B, F]

        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast()); // F

        System.out.println(dq1.remove());
        System.out.println(dq1.poll());
        System.out.println(dq1.removeLast());


        System.out.println(dq1);
    }
}
