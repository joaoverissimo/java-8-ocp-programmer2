package com.verissimo.aula016_JavaTime;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;

public class StringsOfJavaTime {

    public static void main(String[] args) {
        Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);
        System.out.println(fiveSecondsAfterEpoch); //1970-01-01T00:00:05Z

        Instant now = Instant.now();
        System.out.println(now); //2018-07-25T02:16:29.944Z

        Period period5y4m3d = Period.of(5, 4, 3);
        System.out.println(period5y4m3d); //P5Y4M3D

        Duration oneDay = Duration.ofDays(1);
        System.out.println(oneDay);
    }

}
