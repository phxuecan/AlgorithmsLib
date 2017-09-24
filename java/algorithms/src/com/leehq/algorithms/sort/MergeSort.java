package com.leehq.algorithms.sort;

/**
 * ==============================================================
 * Description:
 * Author: leehq phxuecan@git.com phxuecan@sina.cn
 * Since: 2017-09-02
 * ===============================================================
 */
public class MergeSort extends AbstractSort {

    private static final int GROUP_SIZE = 3;

    public MergeSort(ORDERRULE orderRule) {
        super(orderRule);
    }

    @Override
    public void sort(Comparable[] unsorted) {
        if (unsorted.length <= 1) {
            return;
        }
        int offset = unsorted.length / 3;

    }
}
