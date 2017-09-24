package com.leehq.algorithms.sort;

/**
 * First, find the smallest item in the array, and exchange it with the first entry.
 * Then, find the next smallest item and exchange it with the second entry.
 * Continue in this way until the entire array is sorted.
 *
 * Created by leehq on 2017/8/25.
 */
public class SelectSort extends AbstractSort {

    public SelectSort(ORDERRULE orderRule) {
        super(orderRule);
    }

    public void sort(Comparable[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < unsorted.length; j++) {
                if (compare(unsorted[j], unsorted[minIndex])) {
                    minIndex = j;
                }
            }
            exch(unsorted, i, minIndex);
        }
    }
}
