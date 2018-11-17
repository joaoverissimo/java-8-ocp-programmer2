package com.verissimo.aula012_collections;

import com.verissimo.aula000_dtos.MyItemDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest {

    public static void main(String[] args) {
        List<MyItemDTO> list = new ArrayList<>();
        list.add(new MyItemDTO(1L, "Boll", 12));
        list.add(new MyItemDTO(2L, "Zoo", 0));
        list.add(new MyItemDTO(3L, "Car", 1));
        list.add(new MyItemDTO(9L, "Truck", 1));
        list.add(new MyItemDTO(6L, "Umbrella", 0));

        System.out.println(list);

        Iterator<MyItemDTO> iterator = list.iterator();
        while (iterator.hasNext()) {
            MyItemDTO item = iterator.next();

            if (item.getQntd().equals(0)) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }

}
