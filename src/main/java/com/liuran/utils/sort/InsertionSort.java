package com.liuran.utils.sort;

public class InsertionSort extends AbstractSort{
    public InsertionSort(){
        super();
    }

    public InsertionSort(boolean invert){
        super(invert);
    }

    @Override
    public Comparable[] sort(Comparable[] array) {
        for (int i = 1; i < array.length ; i ++){
            int preIndex = i -1;
            Comparable current = array[i];
            //在前i个有序的数列中插入一个数据
            while (true){
                if (preIndex < 0){
                    break;
                }
                if (fistGtSecond(current, array[preIndex])){
                    break;
                }
                array[preIndex + 1] = array[preIndex];

                preIndex --;
            }

            array[preIndex + 1] = current;
        }
        return array;
    }
}
