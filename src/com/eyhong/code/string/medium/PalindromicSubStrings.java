package com.eyhong.code.string.medium;

/**
 * https://leetcode.com/problems/palindromic-substrings/
 *
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 *
 * Example 1:
 *
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 *
 * Example 2:
 *
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 *
 * Note:
 *
 * The input string length won't exceed 1000.
 */
public class PalindromicSubStrings {
    public int countSubstrings(String s) {
        //All single characters are palindromes, so add it to the initial total.
        int result = s.length();
        int lengthOfString = s.length();
        int currIndex = 0;
        //Start the comparison for 2+ characters.
        int subStrLength = 2;

        while(subStrLength <= s.length()){
            if(currIndex >= lengthOfString){
                currIndex = 0;
                subStrLength++;
            }

            if(currIndex + subStrLength <= lengthOfString) {
                String temp = s.substring(currIndex, currIndex + subStrLength);
                String sb = new StringBuilder(temp).reverse().toString();

                if (temp.equals(sb)) {
                    result++;
                }
            }
            currIndex++;
        }
        return result;
    }
}
