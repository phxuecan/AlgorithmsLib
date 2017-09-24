package com.leehq.algorithms.practice;

import java.util.HashMap;

/**
 * ==============================================================
 * Description:
 * 一些算法练习题
 * Author: leehq phxuecan@git.com phxuecan@sina.cn
 * Since: 2017-09-02
 * ===============================================================
 */
public class AlgorithmPractice {

    /**
     * Given an array of integers, return indices of the two numbers such that
     * they add up to a specific target.
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     * For example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * @param nums an array of integers
     * @param target a specific target
     * @return indices
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException();
        }
        /*for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }*/
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int element = target - nums[i];
            if (map.containsKey(element) && map.get(element) != i) {
                return new int[]{i, map.get(element)};
            }
        }
        throw new IllegalStateException("not found");
    }
}
