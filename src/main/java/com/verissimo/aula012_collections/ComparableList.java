package com.verissimo.aula012_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cell implements Comparable<Cell> {
    public String id;
    public String nome;

    public Cell(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int compareTo(Cell o) {
        return this.id.compareTo(o.id);
    }
}

public class ComparableList {

    public static void main(String[] args) {
        Cell obj1 = new Cell("SM13430", "MOTO MAXX");
        Cell obj2 = new Cell("A039553", "SAMSUNG S9");

        List<Cell> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);

        Collections.sort(list);

        for (Cell cell : list) {
            System.out.println(cell.nome);
        }

    }

}
