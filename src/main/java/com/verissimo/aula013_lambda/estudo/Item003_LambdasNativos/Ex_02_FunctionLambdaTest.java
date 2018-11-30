package com.verissimo.aula013_lambda.estudo.Item003_LambdasNativos;

import com.verissimo.aula013_lambda.school.Student;

import java.util.function.*;

public class Ex_02_FunctionLambdaTest {

    public static void main(String[] args) {
        //---------------------------------------------------
        //Function: unary function from T to R
        //---------------------------------------------------
        Function<String, Integer> function = s -> {
            return Integer.valueOf(s);
        };

        Integer functionApply = function.apply("100");

        System.out.println(functionApply);

        //---------------------------------------------------
        //Consumer: unary function from T to void
        //---------------------------------------------------
        Consumer<Student> consumer = student -> {
            student.setName("Name seted by consumer interface, return void");
            return;
        };

        Student aluno = new Student();
        consumer.accept(aluno);
        System.out.println(aluno.getName());

        //---------------------------------------------------
        //Predicate: unary function from T to boolean
        //---------------------------------------------------
        Predicate<Student> predicate = student -> {
            return student.getName().equals("erro");
        };

        boolean predicateTest = predicate.test(aluno);
        System.out.println(predicateTest);
        System.out.println(predicate.negate().test(aluno));

        //---------------------------------------------------
        //Supplier: nilary function to R
        //---------------------------------------------------
        Supplier<Student> supplier = () -> {
            Student student = new Student();
            //scope main>student is diferent this.student
            student.setName("New Student by Supplier");
            return student;
        };

        Student aluno2 = supplier.get();
        System.out.println(aluno2.getName());

        //---------------------------------------------------
        //BiFunction: binary function from T and U to R
        //---------------------------------------------------
        BiFunction<Double, Long, String> biFunction = (aDouble, aLong) -> {
            Integer a = aDouble.intValue();
            Integer b = aLong.intValue();

            return "Int(" + aDouble + ") + Int(" + aLong + "L) => " + (a + b);
        };

        String biFunctionResult = biFunction.apply(10.7D, 11L);
        System.out.println(biFunctionResult);

        /*
           | interface  | method | description  |
           | Function   | apply  | from T to R  |
           | Consumer   | accept | T to void    |
           | Predicate  | test   | T to boolean |
           | Supplier   | get    | void to R    |
           | BiFunction | apply  | T and U to R |
        */

    }

}
