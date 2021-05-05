package com.eyhong.code.array;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args){
        int[] myArr = {1,2,3,4,5,4,3,2,1};
        System.out.println(nonRepeatedElement(myArr));
      }

      public static boolean nonRepeatedElement(int[] myArr){
        // Write Code Here.
          return false;
      }


//    public static int missingNumber(int[] myArr){
//        // Write Code Here.
//        Arrays.sort(myArr); //quick sort [1,2,3,5]
//        return findMissingNumber(myArr, 0, myArr.length);
//
//    }
//    public static int findMissingNumber(int[] arr, int start, int end){
//
//        if((end-start)+1 < 2){
//            return -1;
//        }
//
//        if((end-start)+1 == 2 && arr[start]+1 != arr[end-1]){
//            return arr[start]+1;
//        }
//
//        //0-2, 0,1, 3,
//        int val = findMissingNumber(arr, start, (end+start)/2); //-1
//        val = findMissingNumber(arr,(end/2)+1, end); //3-5
//
//        return val;
//
//    }
//    


//public static boolean containsDuplicate(int[] nums) {
    //Solution #1
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(Integer num : nums){
//            int val = map.getOrDefault(num, 0) + 1;
//            if(val > 1) return true;
//            map.put(num, val);
//        }
//        return false;
    //Solution #2
//        return nums.length != Arrays.stream(nums).distinct().count();
    //Solution #3
//        Set<Integer> set = new HashSet<>();
//
//        for(Integer num : nums){
//            if(set.contains(num)) return true;
//            set.add(num);
//        }
//        return false;

//    }
}
