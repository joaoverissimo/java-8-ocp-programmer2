package com.verissimo.aula013_lambda;


@FunctionalInterface
public interface FunctionalInterfaceAnnotation {

    boolean equals(Object o);

    int hashCode();

    String toString();

    //this method is funtional, the others are from Object and don't matter to @FunctionalInterface
    void method();

}
