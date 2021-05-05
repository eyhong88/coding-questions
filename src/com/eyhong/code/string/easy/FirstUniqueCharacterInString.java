package com.eyhong.code.string.easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 */
public class FirstUniqueCharacterInString {
    public static void main(String[] args){
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new HashMap();

        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            charMap.put(currChar, charMap.getOrDefault(currChar, 0) + 1);
        }

        try {
            return charMap.entrySet().stream()
                    .filter(x -> x.getValue() == 1)
                    .map(x -> s.indexOf(x.getKey()))
                    .min(Comparator.naturalOrder())
                    .orElseThrow(NullPointerException::new);
        }
        catch (Exception e){
            return -1;
        }
    }
}
