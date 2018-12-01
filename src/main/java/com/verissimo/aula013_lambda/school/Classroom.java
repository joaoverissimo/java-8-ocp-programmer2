package com.verissimo.aula013_lambda.school;

import java.util.Optional;

public class Classroom {

    private String name;
    private Teacher teacher;

    public Classroom() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Optional<Teacher> getTeacherOptional() {
        return Optional.ofNullable(teacher);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classroom{" + "name='" + name + '\'' + '}';
    }
}
