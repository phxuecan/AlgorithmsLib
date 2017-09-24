package com.leehq.algorithms;

import java.util.Stack;

/**
 * Created by leehq on 2017/8/24.
 */
public class BasicAlgorithmUtil {
    /**
     * Algorithm for check a given number is prime.
     * @param N
     * @return
     */
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Description:
     *    To check the given string statement is or not a valid statement.
     * @param statement to check statement.
     * @return if valid return true else false.
     */
    public static boolean isValidStatement(String statement){
        char[] charArray = statement.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < charArray.length; i++) {
            char node = charArray[i];
            if (node == '[' || node == '{' || node == '(') {
                stack.push(node);
            } else if(node == ']' || node == '}' || node == ')'){
                Character pop = (Character) stack.pop();
                char target = '[';
                if (node == '}') {
                    target = '{';
                } else if (node == ')') {
                    target = '(';
                }
                if (target == pop.charValue()) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
