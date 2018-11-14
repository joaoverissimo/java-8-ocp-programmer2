package com.verissimo.aula011_generics;

import java.util.List;

public class DeepOverviewGenerics {

    public static void superNumber(List<? super Number> list) {
        //can add childrens
        list.add(new Integer(2));

        //not can retrive
        //Number n = list.get(0);

        //can retrive by object
        Object o = list.get(0);
    }

    public static void extendsNumber(List<? extends Number> list) {
        //not can add childtrens
        //list.add(new Integer());

        //can retrive
        Number n = list.get(0);
    }

    public static void main(String[] args) {

    }

}
