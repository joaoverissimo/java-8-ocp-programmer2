package com.verissimo.aula014_streams.classes;

import java.util.Arrays;
import java.util.List;

public class CityUtils {

    public static List<City> getCitiesList() {
        return Arrays.asList(  //
                new City(12, "Florianópolis", 421_000L), //
                new City(55, "São José", 209_804L), //
                new City(67, "Palhoça", 137_334L), //
                new City(98, "Curitiba", 1_751_000L), //
                new City(25, "Francisco Beltrão", 78_000L), //
                new City(28, "Aparecida", 78_000L), //
                new City(78, "Marmeleiro", 7_765L) //
        );
    }

}
