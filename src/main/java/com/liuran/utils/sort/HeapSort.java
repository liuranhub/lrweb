package com.liuran.utils.sort;

public class HeapSort extends AbstractSort{

    public HeapSort(){

    }

    public HeapSort(boolean invert){
        super(invert);
    }

    @Override
    public Comparable[] sort(Comparable[] array) {
        for (int i = array.length / 2 -1; i >= 0; i --){
            adjustHeap(array, i, array.length);
        }

        for (int i = 1; i < array.length ;i ++){
            swap(array, 0, array.length - i);
            adjustHeap(array, 0, array.length - i);
        }
        return array;
    }

    public void adjustHeap(Comparable[] array, int node, int length){
        int parent = node;
        int k= node * 2 + 1;
        for (;k < length; k = k * 2 +1){
            //判断是否有右节点,如果存在右节点，且右节点大于左节点，把k指向右节点
            if (k + 1 < length && fistGtSecond(array[k + 1], array[k])){
                k ++;
            }

            //判断最大的子节点和当前节点是否需要进行交换
            if (fistGtSecond(array[k], parent)){
                swap(array, parent, k);
            } else {
                break;
            }

            parent = k;
        }

    }
}
