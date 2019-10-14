package com.eyhong.code.strings.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-and-replace-pattern/
 *
 * Example 1:
 * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * Output: ["mee","aqq"]
 * Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
 * "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
 * since a and b map to the same letter.
 *
 * Note:
 * 1 <= words.length <= 50
 * 1 <= pattern.length = words[i].length <= 20
*/
class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        return new ArrayList<>();
    }
}