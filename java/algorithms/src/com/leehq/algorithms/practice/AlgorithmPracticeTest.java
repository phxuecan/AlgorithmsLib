package com.leehq.algorithms.practice;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * ==============================================================
 * Description:
 * Author: leehq phxuecan@git.com phxuecan@sina.cn
 * Since: 2017-09-02
 * ===============================================================
 */
public class AlgorithmPracticeTest {

    @org.junit.Test
    public void twoSum() throws Exception {
        Assert.assertArrayEquals(new int[]{1,2}, AlgorithmPractice.twoSum(new int[]{3,2,4}, 6));
        Assert.assertArrayEquals(new int[]{0,1}, AlgorithmPractice.twoSum(new int[]{3,2,4}, 5));
    }

}