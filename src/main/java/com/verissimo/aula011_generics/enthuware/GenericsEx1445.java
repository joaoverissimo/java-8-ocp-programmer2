package com.verissimo.aula011_generics.enthuware;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx1445 {

    public static <E extends CharSequence> List<? super E> doIt(List<E> nums) {
        return null;
    }

    public static void main(String[] args) {
        ArrayList<String> in = new ArrayList<>();
        List result;
        result = doIt(in);
    }

}
