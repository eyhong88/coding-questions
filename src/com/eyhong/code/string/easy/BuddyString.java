package com.eyhong.code.string.easy;

import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/buddy-strings/
 *
 * Given two strings A and B of lowercase letters,
 * return true if and only if we can swap two letters in A so that the result equals B.
 */
public class BuddyString {
    public static void main(String[] args){
        buddyString("ab", "ba");
    }
    public static boolean buddyString(String A, String B) {
        String aString = A;
        String bString = B;
        int swapCount = 0;
        if (B.length() == A.length()) {
            List<Character> aChar = A.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            List<Character> bChar = B.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

            for (int i = 0; i < aChar.size(); i++) {
                Character aCurr = aChar.get(i);
                Character bCurr = bChar.get(i);
                System.out.println("Current A: " + aCurr + ", Current B: " + bCurr);

                if(A.equals(B) || aCurr != bCurr) {
                    int index = B.indexOf(aCurr, i + 1);
                    if (index >= 0) {
                        Character moveChar = bChar.get(index);
                        bChar.set(i, moveChar);
                        bChar.set(index, bCurr);

                        aString = aChar.stream().map(String::valueOf).collect(Collectors.joining());
                        bString = bChar.stream().map(String::valueOf).collect(Collectors.joining());
                        swapCount++;
                        break;
                    }
                }
            }
        }
        return (aString.equals(bString) && swapCount == 1);
    }
}
