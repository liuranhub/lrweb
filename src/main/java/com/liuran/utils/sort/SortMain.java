package com.liuran.utils.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortMain {
    public static void main(String[] args) {
        Sort sort = new HeapSort(false);
        List<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i=0 ;i < 1 ;i++){
            int value = random.nextInt(50000);
            collection.add(value);
        }

        long start = System.currentTimeMillis();
        List<Integer> result =  sort.sort(collection);
        System.out.println("耗时:" + (System.currentTimeMillis() - start));
        for (Integer value : result){
            System.out.print(value + ",");
        }
    }
}
