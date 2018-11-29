package com.verissimo.aula013_lambda.estudo.Item001_FuncionalInterface;

import java.util.List;

// ####################################################################
// @FunctionalInterface permite anotar para que o compilador não compile
//
//

//@FunctionalInterface
interface NonFuncional {

    void method();

    void method2();
}

// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// ####################################################################
// Somente pode possuir um método abstrato
//
//

//@FunctionalInterface
interface A {

    void method();
}

// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// ####################################################################
// Como os métodos default e static têm uma implementação, eles não são abstratos,
// portanto, uma interface funcional pode ter qualquer número deles.
//

//@FunctionalInterface
interface B {
    default int defaultMethod() {
        return 0;
    }

    default int anotherDefaultMethod() {
        return 0;
    }

    static int estatico() {
        return 100;
    }

    void method();
}


// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// ####################################################################
// Se declarar um método abstrato com a assinatura de um dos métodos de java.lang.Object,
// ele não conta para a contagem do método de interface funcional.
//
//

//@FunctionalInterface
interface LangObj {
    boolean equals(Object o);

    int hashCode();

    String toString();

    void method();
}


// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// ####################################################################
// Um cenário mais confuso é quando uma interface herda um método equivalente,
// mas não idêntico
//
// Nesse caso, o método é o mesmo, portanto, é considerado um método.
// A classe que implementa B terá que implementar o método que pode substituir
// legalmente todos os métodos abstratos:

interface Uso {
    void method(List<Double> l);
}

interface Conf extends Uso {
    void method(String s);
}


// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// ####################################################################
// Outro exemplo de estender outras interfaces
//
//

interface Loco {
    void test();
}

interface Muito {

    void retest();
}

// @FunctionalInterface
interface MuitoLoco extends Muito, Loco {

    // default void retest() {}

}


// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// .
// ####################################################################
//
//
//

//@FunctionalInterface
interface Vazio {

}

