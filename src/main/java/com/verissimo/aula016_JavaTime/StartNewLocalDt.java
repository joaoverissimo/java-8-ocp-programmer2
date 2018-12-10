package com.verissimo.aula016_JavaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class StartNewLocalDt {

    public static void main(String[] args) {
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        LocalDate newYear2002 = LocalDate.of(2002, Month.JANUARY, 1);
        LocalDate today = LocalDate.now();

        System.out.println(newYear2001); //2001-01-01
        System.out.println(newYear2002); //2002-01-01
        System.out.println(today); //2018-07-24

        System.out.println("--------------- TIME -----------");

        LocalTime fiveThirty = LocalTime.of(5, 30);
        LocalTime noon = LocalTime.of(12, 0, 0);
        LocalTime almostMidnight = LocalTime.of(23, 59, 59, 999999);
        LocalTime now = LocalTime.now();

        System.out.println(fiveThirty); //05:30
        System.out.println(noon); //12:00
        System.out.println(almostMidnight); //23:59:59.000999999
        System.out.println(now); //23:11:17.619

        System.out.println("--------------- LOCAL DATE TIME -----------");

        LocalDateTime dt1 = LocalDateTime.of(2014, 9, 19, 14, 5);
        LocalDateTime dt2 = LocalDateTime.of(2014, 9, 19, 14, 5, 20, 9);
        LocalDateTime dt3 = LocalDateTime.now();

        System.out.println(dt1); //2014-09-19T14:05
        System.out.println(dt2); //2014-09-19T14:05:20.000000009
        System.out.println(dt3); //2018-07-24T23:14:24.464
    }

}
