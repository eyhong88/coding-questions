package com.eyhong.code.strings.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWORepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        List<Character> charList = new ArrayList<>();
        int currMax = 0;
        int result = 0;
        int sLength = s.length();

        for(int i = 0; i < sLength; i++){
            char currChar = s.charAt(i);

            if(!charList.contains(currChar)){
                currMax++;
                charList.add(currChar);
                if(i == sLength-1)
                    return Math.max(result,currMax);

            } else {
                if(currMax >= result) {
                    result = currMax;
                    currMax = 0;
                }

                //Find the index of the repeated character starts.
                String temp = s.substring((i-charList.size()),i);
                charList.clear();

                //If the repeated character was the previous character, then continue.
                //Otherwise need to move the index back.
                if(temp.indexOf(currChar) + 1 != temp.length()){
                    i = i - (temp.length()-s.indexOf(s.charAt(i)));
                    currMax = 0;
                }
                else {
                    currMax++;
                    charList.add(currChar);
                }

            }
            System.out.println(charList);
        }
        return result;
    }
}
