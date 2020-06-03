package com.eyhong.code.strings.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example,
 *
 * given n = 1, a solution set is:
 *
 * ()
 *
 * given n = 2, a solution set is:
 *
 * ()()
 * (())
 *
 * given n = 3, a solution set is:
 *
 * ()()()
 * (()())
 * ((()))
 * (())()
 * ()(())
 *
 */
public class GenerateParentheses {

    public static void main(String[] args){
        System.out.println(generateParenthesis(2));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();


        parenthesis(result, "(", n, 1, 0);

        return result;
    }

    public static void parenthesis(List<String> result, String val, int n, int open, int close){

        if(close > open)
            return;

        if((open & close) == n) {
            result.add(val);
            return;
        }

        if(open < n){
            parenthesis(result, val+"(", n, open + 1, close);
        }

        if(close < n)
            parenthesis(result, val+")", n, open, close + 1);
    }
}
