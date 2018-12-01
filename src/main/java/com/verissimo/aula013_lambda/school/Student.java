package com.verissimo.aula013_lambda.school;

import java.util.Optional;

public class Student {

    private String name;
    private Classroom classroom;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public Optional<Classroom> getClassroomOptional() {
        return Optional.ofNullable(classroom);
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + '}';
    }
}
