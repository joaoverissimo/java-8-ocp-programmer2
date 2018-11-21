package com.verissimo.aula012_collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class CellPhone {
    String str;

    CellPhone(String s) {
        this.str = s;
    }

    public String toString() {
        return str;
    }
}

public class SortCompatorExample {
    static final Comparator<CellPhone> cellComparator = new Comparator<CellPhone>() {

        public int compare(CellPhone o1, CellPhone o2) {
            int i1 = o1.str.length();
            int i2 = o2.str.length();

            int compare = -(i1 - i2);
            return compare;
        }

    };

    public static void main(String[] args) {
        CellPhone[] arr = {new CellPhone("2xx"), new CellPhone("4xxxx"), new CellPhone("16xxxxxxxxxxxxxxxx"), new CellPhone("21xxxxxxxxxxxxxxxxxxxxx"), new CellPhone("9xxxxxxxxx")};

        List<CellPhone> list = new ArrayList<>(Arrays.asList(arr));
        list.sort(cellComparator);
        System.out.println(list);
    }

}
