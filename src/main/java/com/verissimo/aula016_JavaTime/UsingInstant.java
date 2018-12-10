package com.verissimo.aula016_JavaTime;

import java.time.Duration;
import java.time.Instant;

public class UsingInstant {

    public static void main(String[] args) {
        Instant start = Instant.now();

        System.out.println(start);             //2018-07-28T16:24:53.089Z
        System.out.println(start.getNano());   //89000000


        for (int i = 0; i < 100; i++) {
            System.out.print(i + ";");
        }

        Instant end = Instant.now();
        System.out.println(end); //2018-07-28T16:24:53.180Z

        Duration d = Duration.between(start, end);

        System.out.println(d); //PT0.091S
        System.out.println(d.getNano()); //91000000


    }

}
