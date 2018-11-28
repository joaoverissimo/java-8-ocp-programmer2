package com.verissimo.aula013_lambda.enthuware;

import java.util.Arrays;
import java.util.List;

public class MyProcessor {
    Integer value;

    public MyProcessor(Integer value) {
        this.value = value;
    }

    public void process() {
        System.out.println(value + " ");
    }

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);

        ls.stream().map(MyProcessor::new).forEach(MyProcessor::process);

    }
}
