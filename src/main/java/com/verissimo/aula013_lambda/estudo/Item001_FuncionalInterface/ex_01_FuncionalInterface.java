package com.verissimo.aula013_lambda.estudo.Item001_FuncionalInterface;

interface IsValid {
    boolean testIt();
}

public class ex_01_FuncionalInterface {

    public static void main(String[] args) {
        // Classe anônima
        IsValid obj = new IsValid() {
            public boolean testIt() {
                return true;
            }
        };

        System.out.println("exec1Anonima: " + obj.testIt());


        // Lambda
        IsValid obj2 = () -> true;
        System.out.println("exec2Lambda: " + obj2.testIt());
    }


}
