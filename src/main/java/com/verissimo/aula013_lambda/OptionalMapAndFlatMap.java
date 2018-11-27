package com.verissimo.aula013_lambda;

import com.verissimo.aula013_lambda.school.Classroom;
import com.verissimo.aula013_lambda.school.Student;
import com.verissimo.aula013_lambda.school.Teacher;

import java.util.Optional;

public class OptionalMapAndFlatMap {

    public static void main(String[] args) {
        //Teacher
        Teacher teacher = new Teacher();
        teacher.setName("Neron");

        //Classroom
        Classroom classroom = new Classroom();
        classroom.setName("Java OO");
        classroom.setTeacher(teacher);

        //Student
        Student student = new Student();
        student.setName("João");
        student.setClassroom(classroom);

        System.out.println(getTeacherNameJava7(student));
        System.out.println(getTeacherNameJava8(student));
        System.out.println(getTeacherNameJava8(null));
    }

    public static String getTeacherNameJava7(Student student) {
        if (student != null) {

            Classroom classroom = student.getClassroom();
            if (classroom != null) {

                Teacher teacher = classroom.getTeacher();
                if (teacher != null) {

                    if (teacher.getName() != null) {
                        return teacher.getName();
                    }
                }
            }
        }

        return "empty name";
    }

    public static String getTeacherNameJava8(Student student) {
        Optional<Student> studentOptional = Optional.ofNullable(student);

        return studentOptional //
                .flatMap(Student::getClassroomOptional) //
                .flatMap(Classroom::getTeacherOptional) //
                .map(Teacher::getName) //
                .orElse("empty name");
    }

}
