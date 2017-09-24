package com.leehq.algorithms.sort;

/**
 * ==============================================================
 * Description:
 * Shell sort algorithm.
 * Author: leehq phxuecan@git.com phxuecan@sina.cn
 * Since: 2017-08-31
 * ===============================================================
 */
public class ShellSort extends AbstractSort {

    public ShellSort(ORDERRULE orderRule) {
        super(orderRule);
    }

    @Override
    public void sort(Comparable[] unsorted) {
        int length = unsorted.length;
        int increment = 1;
        while (increment < length / 3) {
            increment = increment * 3 + 1;
        }
        while (increment >= 1) {
            for (int i = increment; i < length; i++) {
                for (int j = i; j >= increment ; j-=increment) {
                    if (compare(unsorted[j], unsorted[j-increment])) {
                        exch(unsorted, j, j-increment);
                    }
                    show(unsorted);
                }
            }
            increment = increment / 3;
        }
    }
}
