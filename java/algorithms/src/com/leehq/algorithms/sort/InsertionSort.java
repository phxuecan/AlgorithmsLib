package com.leehq.algorithms.sort;

/**
 * Created by leehq on 2017/8/25.
 */
public class InsertionSort extends AbstractSort{

    public InsertionSort(ORDERRULE orderRule) {
        super(orderRule);
    }

    public void sort(Comparable[] unsorted) {
        int n = unsorted.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && compare(unsorted[j], unsorted[j-1]); j--) {
                exch(unsorted, j, j-1);
            }
        }
    }
}
