package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();

        System.out.println(tarih); // 2022-10-29

        System.out.println(tarih.minusDays(100)); // 2022-07-21 yüz gün önce

        System.out.println(tarih.minusWeeks(5).minusDays(3)); // 5 hafta 3 gün önce 2022-09-21

        System.out.println(tarih.plusMonths(5).
                                plusWeeks(3).
                                plusDays(2)); // 5 ay 3 hafta 3 gün sonra

        System.out.println(tarih.getMonthValue()); // 10

        System.out.println(tarih.getMonth()); // OCTOBER
        System.out.println(tarih.getDayOfWeek());// SATURDAY
        System.out.println(tarih.getDayOfYear());// 302

        System.out.println(tarih.isLeapYear()); // false

        System.out.println(tarih.withYear(1994).isLeapYear()); // false
        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));

        System.out.println(tarih.lengthOfYear()); // 365

        System.out.println(tarih.withYear(2020).lengthOfYear()); // 366

        System.out.println(tarih.withYear(1985).withMonth(4).withDayOfMonth(23).getDayOfWeek());

        LocalDate date=LocalDate.of(2011,11,11);
        LocalDate date2=LocalDate.of(2010,10,10);
        System.out.println(date2.isBefore(date)); // true
        System.out.println(date2.isAfter(date)); // false
        System.out.println(tarih.equals(date)); // false
    }
}
