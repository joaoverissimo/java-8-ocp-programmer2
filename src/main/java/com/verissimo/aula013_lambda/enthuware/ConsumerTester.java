package com.verissimo.aula013_lambda.enthuware;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMarks(int m) {
        this.marks += m;
    }

    public void debug() {
        System.out.println(name + ":" + marks);
    }
}

public class ConsumerTester {

    public static void main(String[] args) {
        List<Student> slist = Arrays.asList(new Student("S1", 40), //
                new Student("S2", 35), //
                new Student("S3", 30));

        Consumer<Student> increaseMarks = s -> s.addMarks(10);
        slist.forEach(increaseMarks);
        slist.stream().forEach(Student::debug);

    }

}
