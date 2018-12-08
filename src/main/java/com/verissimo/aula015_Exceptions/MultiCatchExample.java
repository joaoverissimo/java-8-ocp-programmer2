package com.verissimo.aula015_Exceptions;


import java.util.Random;

public class MultiCatchExample {

    public static void main(String[] args) {

        int res = 0;

        try {

            Random gerador = new Random();
            int[] arr = new int[1];

            if (gerador.nextBoolean()) {
                res = 10 / 0; //throws ArithmeticException
            } else {
                res = 10 * arr[5]; //throws IndexOutOfBoundsException
            }

        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e);
            res = -1;
        }

        System.out.println("the value of res: " + res);
    }

}
