package com.eyhong.code.strings;

import com.eyhong.code.strings.easy.ReverseVowelsOnly;
import com.eyhong.code.strings.medium.FindAndReplacePattern;

import java.util.List;

public class StringMain {

    public static void main(String[] args) {

//        ReverseLettersOnly reverseLettersOnly = new ReverseLettersOnly();
//        System.out.println(reverseLettersOnly.reverseOnlyLetters("ab-cd"));

//        Input: "leetcode"
//        Output: "leotcede"
//        ReverseVowelsOnly reverseVowelsOnly = new ReverseVowelsOnly();
//        System.out.println(reverseVowelsOnly.reverseVowels("Aa"));

        String[] words = {/*"abc","cba","xyx","yxx","yyx"*/"xyx"};
        String pattern = "abc";
        FindAndReplacePattern findAndReplacePattern = new FindAndReplacePattern();
        List<String> result = findAndReplacePattern.findAndReplacePattern(words, pattern);

        for(String s : result)
            System.out.println(s);

    }
}
