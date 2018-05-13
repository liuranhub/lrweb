package com.liuran.utils.sort;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSort implements Sort{
    protected boolean invert = false;

    public AbstractSort(){

    }

    public AbstractSort(boolean invert){
        this.invert = invert;
    }

    protected static void changePosition(Comparable[] array, int fist, int second){
        Comparable temp = array[fist];
        array[fist] = array[second];
        array[second] = temp;
    }

    protected static boolean fistGreaterThanSecond(Comparable fist, Comparable second){
        if (fist.compareTo(second) > 0){
            return true;
        }

        return false;
    }


    protected static boolean fistGreaterEqualThanSecond(Comparable fist, Comparable second){
        if (fist.compareTo(second) >= 0){
            return true;
        }

        return false;
    }

    protected static boolean fistLessEqualThanSecond(Comparable fist, Comparable second){
        if (fist.compareTo(second) <= 0){
            return true;
        }

        return false;
    }

    public <T extends Comparable<? super T>> List<T> sort(List<T> list) {
        if (list == null || list.size() <= 1){
            return list;
        }

        Comparable[] result = sort(toArray(list));

        List<T> resultList = new ArrayList<>();
        if (invert){
            for (int i = result.length - 1 ; i >= 0; i --){
                resultList.add((T) result[i]);
            }
        } else {
            for (Comparable comparable : result){
                resultList.add((T) comparable);
            }
        }

        return resultList;
    }

    public abstract Comparable[] sort(Comparable[] array);

    private static <T extends Comparable> Comparable[] toArray(List<T> list){
        Comparable[] array = new Comparable[list.size()];
        for (int i = 0; i < list.size() ; i ++){
            array[i] = list.get(i);
        }

        return array;
    }
}
