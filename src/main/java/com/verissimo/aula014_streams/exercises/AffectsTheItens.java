package com.verissimo.aula014_streams.exercises;


import com.verissimo.aula014_streams.classes.City;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AffectsTheItens {


    public static void main(String[] args) {
        List<City> cities = Arrays.asList(  //
                new City(12, "Florianópolis", 421_000L), //
                new City(55, "São José", 209_804L));

        cities.stream().forEach(el -> el.setName(el.getName() + " CHANGED_1"));
        cities.forEach(el -> System.out.println(el.getName()));
        // Florianópolis CHANGED_1
        // São José CHANGED_1

        cities.forEach(el -> el.setName(el.getName() + " CHANGED_2"));
        cities.forEach(el -> System.out.println(el.getName()));
        // Florianópolis CHANGED_1 CHANGED_2
        // São José CHANGED_1 CHANGED_2

        Comparator<City> c1 = (o1, o2) -> o1.getPopulation().compareTo(o2.getPopulation());
        cities.stream().sorted(c1.thenComparing(City::getCode));
    }

}
