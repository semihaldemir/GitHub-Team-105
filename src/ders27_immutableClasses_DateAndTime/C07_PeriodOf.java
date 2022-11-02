package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        // doğumunuzdan bu güne ne kadar zaman geçti?

        LocalDate dogumTarihi=LocalDate.of(1985,4,23);
        LocalDate SimdikiZaman=LocalDate.now();

        Period gecenSure=Period.between(dogumTarihi,SimdikiZaman);
        System.out.println(gecenSure); // P37Y6M6D
        System.out.println(gecenSure.getYears()); // 37
    }





}
