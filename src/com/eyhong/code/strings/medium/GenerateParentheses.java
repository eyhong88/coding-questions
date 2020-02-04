package com.eyhong.code.strings.medium;

import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class GenerateParentheses {
    /*
    Is a parenthesis open?
        yes - look at next, does it close the parenthesis?
            yes - continue;
            no - continue until no more;
        no - is the current value opening it?
            yes - continue;
            no - end;

    n = 3
    012345
    ((()))  012
    (()())  013
    (())()  014
    ()(())  023
    ()()()  024

    ())(()
    n = 2
    ()()
    (())
     */

//    public List<String> generateParenthesis(int n) {
//    }
}
