package com.liuran.utils.sort;

import java.util.List;

public interface Sort{
    public <T extends Comparable<? super T>> List<T> sort(List<T> list);
}
