package com.verissimo.aula014_streams;

import com.verissimo.aula014_streams.classes.City;
import com.verissimo.aula014_streams.classes.CityUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByFirstLetter {

    public static void main(String[] args) {
        Stream<City> stream = CityUtils.getCitiesList().stream();

        Map<String, List<City>> listMap = stream //
                .collect(Collectors.groupingBy(city -> city.getName().substring(0, 1)));

        System.out.println(listMap.get("A"));
        // [ City{code=28, name='Aparecida'} ]

        System.out.println(listMap.get("F"));
        // [ City{code=12, name='Florianópolis'} , City{code=25, name='Francisco Beltrão'} ]

    }

}
