package com.verissimo.aula014_streams;

import com.verissimo.aula014_streams.classes.City;
import com.verissimo.aula014_streams.classes.CityUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainOfCollectors {

    public static void main(String[] args) {
        List<String> collectToList = getCityStream() //
                .map(city -> "#" + city.getCode().toString()) //
                .collect(Collectors.toList());
        System.out.println(collectToList);
        // [#12, #55, #67, #98, #25, #28, #78]

        String collectJoining = getCityStream() //
                .map(City::getName) //
                .sorted() //
                .collect(Collectors.joining(";"));
        System.out.println(collectJoining);
        // Aparecida;Curitiba;Florianópolis;Francisco Beltrão;Marmeleiro;Palhoça;São José

        Long collectSumming = getCityStream() //
                .collect(Collectors.summingLong(City::getPopulation));
        System.out.println(collectSumming);
        // 2_682_903

        City collectByMin = getCityStream() //
                .collect(Collectors.minBy(Comparator.comparing(City::getPopulation))) //
                .get();
        System.out.println(collectByMin);
        // City{code=78, name='Marmeleiro'}

        LongSummaryStatistics collectSummarizing = getCityStream() //
                .collect(Collectors.summarizingLong(City::getPopulation));
        System.out.println(collectSummarizing);
        // count=7, sum=2682903, min=7765, average=383271,857143, max=1751000

        Map<String, List<City>> collectByGrouping = getCityStream().collect(Collectors.groupingBy(groupBySize()));
        System.out.println(collectByGrouping);
        // { small= [City{code=25, name='Francisco Beltrão'}, City{code=28, name='Aparecida'}, City{code=78, name='Marmeleiro'}],
        //    big=[City{code=98, name='Curitiba'}],
        //    medium=[City{code=12, name='Florianópolis'}, City{code=55, name='São José'}, City{code=67, name='Palhoça'}] }

        Map<String, Long> collectByGroupingAndCount = getCityStream() //
                .collect(Collectors.groupingBy(groupBySize(), //
                        Collectors.counting()));
        System.out.println(collectByGroupingAndCount);
        //{small=3, big=1, medium=3}

        List<Integer> list = Stream.of(1, 2, 3, 4, 5) //
                .collect(() -> new ArrayList<>(), //
                        (List<Integer> l, Integer i) -> l.add(i), //
                        (List<Integer> l1, List<Integer> l2) -> l1.addAll(l2));
        System.out.println(list);
        // [1, 2, 3, 4, 5]
    }

    private static Stream<City> getCityStream() {
        return CityUtils.getCitiesList().stream();
    }

    private static Function<City, String> groupBySize() {
        return city -> {
            if (city.getPopulation() < 100_000) return "small";
            if (city.getPopulation() >= 100_000 && city.getPopulation() < 500_000) return "medium";

            return "big";
        };
    }

}
