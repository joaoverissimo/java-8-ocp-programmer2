package com.verissimo.aula004_MethodsDefaults;

public class MethodsDefaultFromObjects {

    public String toString() {
        return "classe MethodsDefaultFromObjects";
    }

    public int hashCode() {
        return 123456;
    }

    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    public static void main(String[] args) {
        MethodsDefaultFromObjects obj = new MethodsDefaultFromObjects();
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());

        MethodsDefaultFromObjects obj2 = new MethodsDefaultFromObjects();
        System.out.println(obj.equals(obj2));
    }

}
