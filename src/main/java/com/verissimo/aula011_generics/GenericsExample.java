package com.verissimo.aula011_generics;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    abstract void print();
}

class Gato extends Animal {
    @Override
    void print() {
        System.out.println("Gato");
    }
}

class Cachorro extends Animal {
    @Override
    void print() {
        System.out.println("Cachorro");
    }
}

public class GenericsExample {
    static void ImprimirAnimal(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.print();
        }
    }

    static void ImprimirAnimalExtends(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.print();
        }
    }

    static void ImprimirAnimalSuper(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
        //animals.add(new Object());   // does not compile
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Gato());
        animals.add(new Cachorro());

        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato());

        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro());

        List<Object> objects = new ArrayList<>();

        ImprimirAnimal(animals);
        //ImprimirAnimal(gatos); //does not compile
        //ImprimirAnimal(cachorros); //does not compile

        ImprimirAnimalExtends(animals);
        ImprimirAnimalExtends(gatos);
        ImprimirAnimalExtends(cachorros);
        //ImprimirAnimalExtends(objects); does not compile

        ImprimirAnimalSuper(animals);
        ImprimirAnimalSuper(objects);
        //ImprimirAnimalSuper(gatos);     does not compile
        //ImprimirAnimalSuper(cachorros);    does not compile

    }
}
