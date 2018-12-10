package com.verissimo.aula016_JavaTime;

import java.time.Instant;
import java.time.LocalDateTime;

public class IntantVsDateTime {

    public static void main(String[] args) {
        Instant i = Instant.now();
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(i);
        System.out.println(dt);

        //2018-07-28T16:22:12.178Z
        //2018-07-28T13:22:12.291
    }

}
