package com.eyhong.code.strings;

import java.util.*;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 *
 */
class ReverseVowelsOnly {

    List<Character> vowelList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'));

    String reverseVowels(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(Character c : arr){
            if(vowelList.contains(c)){
                st.push(c);
            }
        }

        for(int i = 0; i < arr.length; i++){

            if(vowelList.contains(arr[i])){
                 arr[i] = st.pop();
            }
        }

        return new String(arr);

    }
}