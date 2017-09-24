package com.leehq.algorithms;

import com.leehq.algorithms.practice.AlgorithmPractice;
import com.leehq.algorithms.sort.ISort;
import com.leehq.algorithms.sort.SortAlgorithmFactory;
import com.leehq.algorithms.stdlib.StdOut;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Administrator on 2017/8/25 0025.
 */
public class Application {

    public static void main(String[] args) {
        ISort sort = SortAlgorithmFactory.createSortAlgorithm(SortAlgorithmFactory.ALGORITHM.SHELL);
        int length = 11;
        Comparable[] randomArray = randomArray(length);
        System.out.println("待排数据：");
        sort.show(randomArray);
        sort.sort(randomArray);
        System.out.println("排序之后：");
        sort.show(randomArray);

        StdOut.println("(A+B)+{(a+B)+[1+2]} is statement? " + BasicAlgorithmUtil.isValidStatement("(A+B)+{(a+B)+[1+2]}"));
        StdOut.println("(A+B)+{(a+B)+[1+2)} is statement? " + BasicAlgorithmUtil.isValidStatement("(A+B)+{(a+B)+[1+2)}"));

        StdOut.println(3<<1);

        int[] indices = AlgorithmPractice.twoSum(new int[]{3, 2, 3}, 6);
        StdOut.println(String.format("[%d,%d]", indices[0], indices[1]));
    }

    private static Comparable[] randomArray(int length) {
        Double[] randomArray = new Double[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = Math.random() * 20;
        }
        return randomArray;
    }
}
