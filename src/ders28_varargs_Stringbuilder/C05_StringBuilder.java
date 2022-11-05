package ders28_varargs_Stringbuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("java candır.");

        System.out.println(sb.capacity()); // 16+12=28
        System.out.println(sb.length()); // 12

        System.out.println(sb.reverse()); // rıdnac avaj
        sb.reverse();
        sb.replace(0,4,"yaaaaa");

        System.out.println(sb); // yaaaaa candır.

        sb.insert(18,"bu bir yalandır");
        System.out.println(sb);

        String str="java çok güzel";
        sb.insert(21,str,9,14);
    }
}
