package com.eyhong.code.strings.medium;

import java.util.*;

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
public class FindAndReplacePattern {

//    Map<Character, Integer> patternLetterMap;
//    Map<Character, Integer> arrLetterMap;
    /*public List<String> findAndReplacePattern(String[] words, String pattern) {
//        for(Character c : pattern.toCharArray()){
//            int count = patternLetterMap.get(c);
//            System.out.println("Count for " + c + ": " + count);
//            patternLetterMap.put(c, count + 1);
//        }

        List<String> result = new ArrayList<>();
        for(String word: words){
            arrLetterMap = new HashMap<>();
            patternLetterMap = new HashMap<>();

            if(word.length() != pattern.length()) {
                continue;
            }

            char[] patternArr = pattern.toCharArray();
            char[] wordArr = word.toCharArray();

            boolean mismatch = false;
            for(int i = 0; i < patternArr.length; i++){
                int patternCount = patternLetterMap.getOrDefault(patternArr[i], 0);
                int wordCount = arrLetterMap.getOrDefault(wordArr[i], 0);

                if(patternCount != wordCount) {
                    mismatch = true;
                    break;
                }

                arrLetterMap.put(wordArr[i], wordCount + 1);
                patternLetterMap.put(patternArr[i], patternCount + 1);
            }
            if(!mismatch){

                result.add(word);
            }
        }

        return result;
    }*/
    /*public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> result = new ArrayList<>();

        for(String word : words) {

            boolean mismatch = false;

            char[] wordArr = word.toCharArray();
            char[] patternArr = pattern.toCharArray();

            char wordCurr = wordArr[0];
            char patternCurr = patternArr[0];

            arrLetterMap = new HashMap<>();
            patternLetterMap = new HashMap<>();

            arrLetterMap.put(wordCurr, arrLetterMap.getOrDefault(wordCurr, 0) + 1);
            patternLetterMap.put(patternCurr, patternLetterMap.getOrDefault(patternCurr, 0) + 1);
            for (int i = 1; i < pattern.length(); i++) {

                if((wordCurr == wordArr[i] &&
                    patternCurr == patternArr[i]) ||
                        (wordCurr != wordArr[i] &&
                        patternCurr != patternArr[i])){

                        wordCurr = wordArr[i];
                        patternCurr = patternArr[i];

                        arrLetterMap.put(wordCurr, arrLetterMap.getOrDefault(wordCurr, 0) + 1);
                        patternLetterMap.put(patternCurr, patternLetterMap.getOrDefault(patternCurr, 0) + 1);
                }
                else {
                    mismatch = true;
                    break;
                }

                if(!arrLetterMap.getOrDefault(wordCurr, 0).equals(patternLetterMap.getOrDefault(patternCurr, 0))){
                    mismatch = true;
                    break;
                }
            }

            if(!mismatch){

                result.add(word);
            }
        }
        return result;
    }*/

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        Map<Character, List<Integer>> pm = new HashMap<>();

        List<String> result = new ArrayList<>();
        char[] pa = pattern.toCharArray();

        populateMap(pm, pa);

        // Loop through the list of words and for each word process accordingly.
        for(String word : words) {
            if (word.length() != pattern.length()) {
                continue;
            }

            Map<Character, List<Integer>> wm = new HashMap<>();

            boolean isMatch = true;
            char[] wa = word.toCharArray();

            populateMap(wm, wa);

            // Loop through each List and determine if they have the same index values.
            for(int i = 0; i < pa.length; i++){
                List<Integer> pl = pm.get(pa[i]);
                List<Integer> wl = wm.get(wa[i]);

                if(pl.size() == wl.size()) {
                    for(int p = 0; p < pl.size(); p++){
                        if(!pl.get(p).equals(wl.get(p))){
                            isMatch = false;
                            break;
                        }
                    }
                } else {
                    isMatch = false;
                    break;
                }

                if(!isMatch){
                    break;
                }
            }

            if(isMatch){
                result.add(word);
            }
        }

        return result;
    }

    private void populateMap(Map<Character, List<Integer>> pm, char[] pa){
        for(int i = 0; i < pa.length; i++){
            List<Integer> pl = pm.getOrDefault(pa[i], new ArrayList<>());

            // Add the index to the list
            pl.add(i);

            //Do I even need this? Won't it automatically be put on?
            pm.put(pa[i], pl);
        }
    }
}