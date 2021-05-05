package com.eyhong.code.string.medium;

import java.util.ArrayList;
import java.util.List;

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
    public int lengthOfLongestSubstring(String s) {int result = 0;

        List<Character> charList = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(!charList.contains(s.charAt(j))) {
                    charList.add(s.charAt(j));
                }
                else
                    break;
            }
            if(charList.size() > result){
                result = charList.size();
            }

            //Don't do extra iterations if not necessary
            if(s.length() - i < result)
                break;

            charList.clear();
        }

        return result;
    }
}
