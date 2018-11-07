package com.verissimo.aula005_SingletonAndImmutable;

import java.util.ArrayList;
import java.util.List;

public final class PersonImmutable {

    private final String fullName;

    private final List<String> nickNames;

    public PersonImmutable(String fullName, List<String> nickNames) {
        this.fullName = fullName;
        this.nickNames = new ArrayList<>(nickNames);
    }

    public static void main(String[] args) {
        ArrayList<String> nicks = new ArrayList<>();
        nicks.add("verissimo");
        nicks.add("joao");

        PersonImmutable p = new PersonImmutable("Joao Verissimo", nicks);
        //p.setName("Error");
    }

    public String getFullName() {
        return fullName;
    }

    public List<String> getNickNames() {
        return new ArrayList<>(nickNames);
    }

}
