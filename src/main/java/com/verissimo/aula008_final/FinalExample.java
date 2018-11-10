package com.verissimo.aula008_final;

public class FinalExample {

    private final int instanceVar1;
    private final static int staticVar1;

    static {staticVar1 = 1;}

    FinalExample() {
        instanceVar1 = 1;
    }

    FinalExample(int i) {
        instanceVar1 = i;
    }

    FinalExample(boolean b) {
        this();
    }

}
