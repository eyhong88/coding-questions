package com.eyhong.code.strings.easy;

public class ReverseLettersOnly {

    public String reverseOnlyLetters(String S) {

        char[] s = S.toCharArray();
        int endIdx = s.length-1;

        for(int i = 0; i < endIdx; i++){

            int startIdx = i;
            char endVal = s[endIdx];
            char startVal = s[i];
            int endValAscii = (int)endVal;
            int startValAscii = (int)startVal;
            boolean cont = true;

            while(!Character.isAlphabetic(s[endIdx])){
                endIdx--;
                if(endIdx >= 0) {
                    endVal = s[endIdx];
                    endValAscii = (int) endVal;
                }
                else {
                    cont = false;
                    break;
                }
            }
            while(!Character.isAlphabetic(s[startIdx])){
                startIdx++;
                if(startIdx > s.length-1) {
                    startVal = s[startIdx];
                    startValAscii = (int) startVal;
                }
                else {
                    cont = false;
                    break;
                }
            }

            if(cont) {
                char temp = endVal;
                s[endIdx] = s[startIdx];
                s[startIdx] = temp;
                endIdx--;
                i = startIdx;
            }
        }

        return String.valueOf(s);
    }
}