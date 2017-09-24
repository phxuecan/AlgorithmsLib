package com.leehq.algorithms.sort;

public class SortAlgorithmFactory {
    public enum ALGORITHM {
        SELECTION,
        INSERTION,
        SHELL
    }

    /**
     * Create sort algorithm by default ascending order rule.
     * @param algorithm some sort algorithm by {@link ALGORITHM}
     * @return
     */
    public static ISort createSortAlgorithm(ALGORITHM algorithm) {
        return createSortAlgorithm(algorithm, AbstractSort.ORDERRULE.ASCEND);
    }

    /**
     * Sort Algorithm factory method.
     * @param algorithm {@link ALGORITHM}
     * @param orderrule {@link com.leehq.algorithms.sort.AbstractSort.ORDERRULE}
     * @return
     */
    public static ISort createSortAlgorithm(ALGORITHM algorithm, AbstractSort.ORDERRULE orderrule){
        switch (algorithm) {
            case SELECTION:
                return new SelectSort(orderrule);
            case INSERTION:
                return new InsertionSort(orderrule);
            case SHELL:
                return new ShellSort(orderrule);
            default:
                return new SelectSort(orderrule);
        }
    }
}
