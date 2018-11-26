package com.verissimo.aula013_lambda;

import com.verissimo.aula013_lambda.school.Student;

import java.util.Arrays;
import java.util.List;

public class LambdaCompiles {

    public static void main(String[] args) {
        List<Student> alunos = Arrays.asList( //
                new Student("João"), //
                new Student("Pedro"), //
                new Student("Maria"));

        alunos.forEach(aluno -> System.out.println(aluno));
        // Student{name='João'}
        // Student{name='Pedro'}
        // Student{name='Maria'}

        String forAluno = "";
        //alunos.forEach(forAluno -> System.out.println(forAluno.getName()));
        // does not compile (forAluno is used before the lambda)

        alunos.forEach(System.out::println);
        // Student{name='João'}
        // Student{name='Pedro'}
        // Student{name='Maria'}

    }

}
