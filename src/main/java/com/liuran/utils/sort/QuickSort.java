package com.liuran.utils.sort;

public class QuickSort extends AbstractSort{
    public QuickSort(){
        super();
    }

    public QuickSort(boolean invert){
        super(invert);
    }

    @Override
    public Comparable[] sort(Comparable[] array) {
        quickSort(array, 0, array.length -1);
        return array;
    }

    private void quickSort(Comparable[] array, int left, int right){
        if (left >= right){
            return;
        }
        //去第一个为以基准数
        int pivot = left;
        int i = left;
        int j = right;
        while (true){
            if (i == j){
                break;
            }

            //从右向左找出第一个比基准数小的
            while (fistGreaterEqualThanSecond(array[j], array[pivot]) && i < j){
                j --;
            }

            //从左往右找出第一个比基准数大的
            while (fistLessEqualThanSecond(array[i], array[pivot]) && i < j){
                i ++;
            }
            changePosition(array, i, j);
        }

        changePosition(array, pivot, i );
        quickSort(array, left, i - 1);
        quickSort(array, i + 1 , right);
    }
}
