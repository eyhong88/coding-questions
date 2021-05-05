package com.eyhong.code.string;

import com.eyhong.code.string.medium.LongestSubstringWORepeatingCharacters;
import com.eyhong.code.string.medium.PalindromicSubStrings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class StringMain {

    public static void main(String[] args) {

//        ReverseLettersOnly reverseLettersOnly = new ReverseLettersOnly();
//        System.out.println(reverseLettersOnly.reverseOnlyLetters("ab-cd"));

//        Input: "leetcode"
//        Output: "leotcede"
//        ReverseVowelsOnly reverseVowelsOnly = new ReverseVowelsOnly();
//        System.out.println(reverseVowelsOnly.reverseVowels("Aa"));

//        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
//        String pattern = "abb";
//        FindAndReplacePattern findAndReplacePattern = new FindAndReplacePattern();
//        List<String> result = findAndReplacePattern.findAndReplacePattern(words, pattern);
//
//        for(String s : result)
//            System.out.println(s);

//        palindromicSubstring("aaa");
        List<PartnerJob> unproc = new ArrayList<>();
        PartnerJob s = new PartnerJob();
        s.effectiveDate = LocalDate.now();
        s.srcModifiedDate = LocalDateTime.of(2021,2,23,0,0);
        unproc.add(s);

        List<PartnerJob> proc = new ArrayList<>();
        PartnerJob s2 = new PartnerJob();
        s2.effectiveDate = LocalDate.of(2020,2,23);
        s2.srcModifiedDate = LocalDateTime.of(2020,2,23,0,0);
        PartnerJob s3 = new PartnerJob();
        s3.effectiveDate = LocalDate.of(2021,2,23);
        s3.srcModifiedDate = LocalDateTime.of(2021,1,23,0,0);
        s3.keyHolder = true;
        proc.add(s2);
        proc.add(s3);

        unproc
            .stream()
            .filter(job -> job.getEffectiveDate().isEqual(LocalDate.now()))
            .max(Comparator.comparing(PartnerJob::getSrcModifiedDate))
            .flatMap(currDatedUnprocessedJob ->
                    proc
                        .stream()
                        .max(Comparator.comparing(PartnerJob::getSrcModifiedDate)
                                .thenComparing(PartnerJob::getEffectiveDate))
                        .filter(currDatedUnprocessedJob::equals))
            .ifPresent(latestProcJob -> {
                if (latestProcJob.isKeyHolder()) {
                    System.out.println("Keyholder");
                } else {
                    System.out.println("Not Keyholder");
                }
            });

    }


    static class PartnerJob{

        public LocalDate effectiveDate;
        public LocalDateTime srcModifiedDate;
        public boolean keyHolder;

        public boolean isKeyHolder(){
            return keyHolder;
        }
        public LocalDate getEffectiveDate(){
            return effectiveDate;
        }
        public LocalDateTime getSrcModifiedDate(){
            return srcModifiedDate;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PartnerJob that = (PartnerJob) o;
            return Objects.equals(effectiveDate, that.effectiveDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(effectiveDate, srcModifiedDate);
        }
    }

    private static void ss(A a) {
        a.s.str = "peace";
    }

    static class A {
        S s;
    }
    static class S {
        String str;
    }

    private static void longestSubstringWORepeatingCharacters(String s) {
        LongestSubstringWORepeatingCharacters longest = new LongestSubstringWORepeatingCharacters();
        System.out.println(longest.lengthOfLongestSubstring(s));
    }

    private static void palindromicSubstring(String str) {
        PalindromicSubStrings s = new PalindromicSubStrings();
        System.out.println(s.countSubstrings(str));
    }
}
