package com.leehq.algorithms.sort;

/**
 * Sorting is the process of rearranging a sequence of objects so as to put them in some logical order.
 * Sorting plays a major role in commercial data processing and in modern scientific computing.
 * Applications abound in transaction processing, combinatorial optimization, astrophysics, molecular dynamics,
 * linguistics, genomics, weather prediction, and many other fields.
 * ---《Algorithms,4th Edition》by Robert Sedgewick and Kevin Wayne.
 *
 * Created by leehq on 2017/8/24.
 */
abstract class AbstractSort implements ISort{

    private ORDERRULE mOrderRule = ORDERRULE.ASCEND;

    public enum ORDERRULE {
        DESCEND,
        ASCEND
    }
    public AbstractSort(ORDERRULE orderRule) {
        mOrderRule = orderRule;
    }

    protected boolean compare(Comparable a, Comparable b){
        return mOrderRule == ORDERRULE.ASCEND ? a.compareTo(b) < 0 : a.compareTo(b) > 0;
    }

    protected void exch(Comparable[] source, int i, int j){
        Comparable temp = source[i];
        source[i] = source[j];
        source[j] = temp;
    }

    @Override
    public void show(Comparable[] source){
        for (int i = 0; i < source.length; i++) {
            System.out.print(String.format("%.2f,", source[i]));
        }
        System.out.print("\n");
    }
}
