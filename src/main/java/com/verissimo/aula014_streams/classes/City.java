package com.verissimo.aula014_streams.classes;

public class City {

    private Integer code;
    private String name;
    private Long population;

    public City(Integer code, String name, Long population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" + "code=" + code + ", name='" + name + '\'' + ", population=" + population + '}';
    }


}
