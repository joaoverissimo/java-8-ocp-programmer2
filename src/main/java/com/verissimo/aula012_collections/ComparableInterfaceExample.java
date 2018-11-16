package com.verissimo.aula012_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ObjDTO {
    public Integer id;
    public String name;

    public ObjDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n objDTO{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

class ObjComparatorById implements Comparator<ObjDTO> {

    @Override
    public int compare(ObjDTO o1, ObjDTO o2) {
        return o1.id.compareTo(o2.id);
    }
}

class ObjComparatorByName implements Comparator<ObjDTO> {
    @Override
    public int compare(ObjDTO o1, ObjDTO o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class ComparableInterfaceExample {

    public static void main(String[] args) {
        List<ObjDTO> list = new ArrayList<>();
        list.add(new ObjDTO(1, "Abacaxi"));
        list.add(new ObjDTO(3, "Uva"));
        list.add(new ObjDTO(5, "Banana"));
        list.add(new ObjDTO(2, "Manga"));
        list.add(new ObjDTO(4, "Morango"));

        Collections.sort(list, new ObjComparatorById());
        System.out.println("list = " + list);

        Collections.sort(list, new ObjComparatorByName());
        System.out.println("list = " + list);
    }

}
