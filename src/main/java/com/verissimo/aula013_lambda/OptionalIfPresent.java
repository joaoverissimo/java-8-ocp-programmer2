package com.verissimo.aula013_lambda;

import com.verissimo.aula013_lambda.school.Teacher;

import java.util.Optional;

public class OptionalIfPresent {

    public static void main(String[] args) {
        //Teacher
        Teacher teacher = new Teacher();
        teacher.setName("Pedro Rosa");

        isPedroRosaJava7(teacher); //is Pedro Rosa
        isPedroRosaJava8(teacher); //is Pedro Rosa
        isPedroRosaJava8(null);
    }

    public static void isPedroRosaJava7(Teacher teacher) {
        if (teacher.getName() != null) {
            if (teacher.getName().equals("Pedro Rosa")) {
                System.out.println("is Pedro Rosa");
            }
        }
    }

    public static void isPedroRosaJava8(Teacher teacher) {
        Optional<Teacher> teacherOptional = Optional.ofNullable(teacher);

        teacherOptional //
                .filter(e -> e.getName().equals("Pedro Rosa")) //
                .ifPresent(e -> System.out.println("is Pedro Rosa"));
    }

}
