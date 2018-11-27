package com.verissimo.aula013_lambda;

import com.verissimo.aula013_lambda.school.Classroom;
import com.verissimo.aula013_lambda.school.Student;

import java.util.Optional;

public class OptionalNullPointerException {

    public static void main(String[] args) {
        //Classroom
        Classroom classroom = new Classroom();
        classroom.setName("Java OO");
        classroom.setTeacher(null);

        //Student
        Student student = new Student();
        student.setName("João");
        student.setClassroom(classroom);

        //Optional success
        String out = Optional.ofNullable(student) //
                .map(s -> s.getClassroom().getTeacher()) //
                .map(s -> s.getName()) //
                .orElse(null);

        System.out.println("the first optional is: " + out);


        //Optional error, throws NullPointerException
        String out1 = Optional.ofNullable(student) //
                .map(s -> s.getClassroom().getTeacher().getName()) //
                .orElse(null);

        System.out.println("the second optional is: " + out1);
    }

}
