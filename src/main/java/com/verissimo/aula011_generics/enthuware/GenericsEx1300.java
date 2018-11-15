package com.verissimo.aula011_generics.enthuware;

import java.util.List;

public class GenericsEx1300 {

    public void m1(List<? extends Number> list) {
        //list.add(new Integer(10));
        //Error at compile time because the compiler
        //only knows that list contains Number or its subclass objects. But it doesn't know the exact type.
        //Therefore, it will not allow you to add anything to it.

        Number n = list.get(1);  //This will work because the compiler knows that every object in list IS-A Number.
    }

    public static void main(String[] args) {
        Integer i = 0;
        String s = "s";

        //i.compareTo(s);  does't compile, because comparteTo needs a Integer
    }


}
