package ders27_immutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat); // 19:21:27.210192800

        LocalTime saat2= LocalTime.of(19,10,20);


    }
}
