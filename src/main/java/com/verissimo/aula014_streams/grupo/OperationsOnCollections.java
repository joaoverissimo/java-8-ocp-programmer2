package com.verissimo.aula014_streams.grupo;

import com.verissimo.aula014_streams.classes.City;
import com.verissimo.aula014_streams.classes.CityUtils;

import java.util.Comparator;
import java.util.List;


public class OperationsOnCollections {

    public static void main(String[] args) {
        List<City> citiesList = CityUtils.getCitiesList();

        // citiesList.forEach(System.out::println);

        // Collections.sort(citiesList);

        // sorted
        // citiesList.stream().sorted().forEach(System.out::println);


        class CitiesByPopulation implements Comparator<City> {
            public int compare(City o1, City o2) {
                return o1.getPopulation().compareTo(o2.getPopulation());
            }
        }

        // citiesList.stream().sorted(new CitiesByPopulation()).forEach(System.out::println);


//        citiesList.stream().sorted((o1, o2) -> o1.getPopulation().compareTo(o2.getPopulation())) //
//                .forEach(System.out::println);

//        citiesList.stream().sorted(City::getPopulation)) //
//                .forEach(System.out::println);

//        citiesList.stream() //
//                .filter(el -> el.getName().substring(0, 1).equals("F") || el.getName().substring(0, 1).equals("C")) //
//                .sorted((o1, o2) -> {
//                    String s1 = o1.getName().substring(0, 1);
//                    String s2 = o2.getName().substring(0, 1);
//                    int compare = s1.compareTo(s2);
//
//                    if (compare != 0) {
//                        return compare;
//                    }
//
//                    return o1.getCode().compareTo(o2.getCode());
//                }).forEach(System.out::println);
//
//
//        citiesList.stream() //
//                .filter(el -> el.getName().substring(0, 1).equals("F") || el.getName().substring(0, 1).equals("C")) //
//                .sorted(Comparator.comparing(City::getName)).forEach(System.out::println);

//        citiesList.stream() //
//                .filter(el -> el.getName().substring(0, 1).equals("F") || el.getName().substring(0, 1).equals("C")) //
//                .sorted( //
//                        Comparator.comparing((City s) -> s.getName().substring(0, 1)) //
//                                .thenComparing(x -> x.getCode())
//                        //
//                ).forEach(System.out::println);


        citiesList.stream() //
                .filter(el -> el.getName().substring(0, 1).equals("F") || el.getName().substring(0, 1).equals("C")) //
                .min( //
                        Comparator.comparing((City s) -> s.getName().substring(0, 1)) //
                                .thenComparing(x -> x.getCode())
                        //
                ).ifPresent(System.out::println);


    }

}
