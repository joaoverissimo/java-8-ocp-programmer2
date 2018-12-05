package com.verissimo.aula014_streams;

import java.util.stream.Stream;

public class StreamPipeline {

    public static void main(String[] args) {
        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand").map(str -> {
            System.out.println("Mapping: " + str);
            return str.length();
        }).filter(i -> {
            boolean isValid = i > 3;
            System.out.println("Filtering: " + i + "; value is: " + isValid);
            return isValid;
        }).limit(2) //
                .forEach(el -> {
                    System.out.println("print ln: " + el);
                });

        // the result:
        //   Mapping: sun
        //   Filtering: 3; value is: false

        //   Mapping: pool
        //   Filtering: 4; value is: true
        //   print ln: 4

        //   Mapping: beach
        //   Filtering: 5; value is: true
        //   print ln: 5


        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand").map(str -> {
            System.out.println("Mapping (sorted): " + str);
            return str.length();
        }).filter(i -> {
            boolean isValid = i > 3;
            System.out.println("Filtering (sorted): " + i + "; value is: " + isValid);
            return isValid;
        }).sorted() //
                .limit(2) //
                .forEach(el -> {
                    System.out.println("print ln (sorted): " + el);
                });

        // Mapping (sorted): sun
        // Filtering (sorted): 3; value is: false

        // Mapping (sorted): pool
        // Filtering (sorted): 4; value is: true

        // Mapping (sorted): beach
        // Filtering (sorted): 5; value is: true

        // Mapping (sorted): kid
        // Filtering (sorted): 3; value is: false

        // Mapping (sorted): island
        // Filtering (sorted): 6; value is: true

        // Mapping (sorted): sea
        // Filtering (sorted): 3; value is: false

        // Mapping (sorted): sand
        // Filtering (sorted): 4; value is: true

        // print ln (sorted): 4
        // print ln (sorted): 4


    }

}
