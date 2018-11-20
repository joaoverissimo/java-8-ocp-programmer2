package com.verissimo.aula012_collections;

import com.verissimo.aula000_dtos.MyItemDTO;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {

    public static void main(String[] args) {
        //MyItemDTO need implements comparable
        NavigableSet<MyItemDTO> list = new TreeSet<>();
        list.add(new MyItemDTO(1L, "Boll", 12));
        list.add(new MyItemDTO(2L, "Zoo", 0));
        list.add(new MyItemDTO(3L, "Car", 1));
        list.add(new MyItemDTO(9L, "Truck", 1));

        for (MyItemDTO dto : list) {
            System.out.println(dto);
        }

        System.out.println("------------------------");

        // LigaFutebolHolandaClub
        // lower <           -> obtem a posição de um item menor
        // floor <=           -> obtem a posição de um item igual ou menor
        // higher >          -> obtem a posição de um maior
        // ceiling >=        -> obtem a posição de um item igual ou maior
        // list.descendingIterator()     -> inverte a ordem da lista
        // list.pollFirst()      -> pega o primeiro item e remove da lista
        // list.pollLast()      -> pega o último item e remove da lista


    }

}
