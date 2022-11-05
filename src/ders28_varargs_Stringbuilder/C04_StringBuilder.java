package ders28_varargs_Stringbuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(8);

        // java 8 karakter alabilecek bir StringBuilder oluşturur
        System.out.println(sb.capacity()); // kapasite 8
        System.out.println(sb.length()); // değer atanmadığı için 0

        sb.append("java");
        System.out.println(sb);
        System.out.println(sb.capacity()); // kapasite 8
        System.out.println(sb.length()); // 4

        sb.append(" güzeldir.");
        System.out.println(sb); // java güzeldir.
        System.out.println(sb.capacity()); // kapasite 8*2+2=18
        System.out.println(sb.length()); // 14

        sb.append(" ona ne şüphe");
        System.out.println(sb); // java güzeldir. ona ne şüphe
        System.out.println(sb.capacity()); // kapasite 18*2+2=38
        System.out.println(sb.length()); // 27

        // kapasite ve lenghti eşitlemek istersek
        sb.trimToSize();
        System.out.println(sb); // java güzeldir. ona ne şüphe
        System.out.println(sb.capacity()); // kapasite 27
        System.out.println(sb.length()); // 27

    }
}
