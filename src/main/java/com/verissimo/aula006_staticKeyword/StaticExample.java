package com.verissimo.aula006_staticKeyword;

public class StaticExample {

    private static int staticValue;
    private int instanceValue;

    public static void main(String[] args) {
        StaticExample a = new StaticExample();
        StaticExample b = new StaticExample();
        a.instanceValue = 1;
        a.staticValue = 1;

        System.out.println(b.instanceValue);
        System.out.println(b.staticValue);

    }

}
