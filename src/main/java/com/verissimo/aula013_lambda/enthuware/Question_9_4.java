package com.verissimo.aula013_lambda.enthuware;

interface B {
    Number m();
}

public class Question_9_4 {

    public static void main(String[] args) {
        B classB = () -> 7 * 12.0;
        Number num = classB.m();

        System.out.println(num);
    }

}
