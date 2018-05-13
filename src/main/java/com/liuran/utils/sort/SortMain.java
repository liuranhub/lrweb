package com.liuran.utils.sort;

import java.util.ArrayList;
import java.util.List;

public class SortMain {
    public static void main(String[] args) {
        Sort sort = new QuickSort(false);
        List<Integer> collection = new ArrayList<>();
        collection.add(4);
        collection.add(2);
        collection.add(1);
        collection.add(5);
        collection.add(4);
        collection.add(3);
        collection.add(7);
        collection.add(6);
        collection.add(8);
        collection.add(4);

        for (Integer value : sort.sort(collection)){
            System.out.println(value);
        }
    }
}
