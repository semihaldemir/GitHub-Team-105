package ders27_immutableClasses_DateAndTime;

public class C01_Immutable {

    public static void main(String[] args) {

        // bu kod çalıştığında java kaç obje oluşturur? // 11

        String str="Ali";

        for (int i = 0; i < 10; i++) {
            str+=".";

        }
        System.out.println(str);
    }
}
