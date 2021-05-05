package com.eyhong.code.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
//    static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args){

        int n = 47;
        Long[] list = new Long[n + 1];
        System.out.println("val: " + dpFib(n, list));
        System.out.println(fib(n));
    }
    public static Long dpFib(int n, Long[] list){
        Long result;
        if(list[n] != null) {
            System.out.println("not null for: " + list[n]);
            return list[n];
        }
        if(n == 1 || n == 2) {
            System.out.println("n = 1 or 2 : " + n);
            result = 1L;
        }
        else {
            result = dpFib(n - 1, list) + dpFib(n - 2, list);
        }
        System.out.println("adding to list[" + n + "]: " + result);
        Arrays.stream(list).forEach(System.out::println);
        list[n] =  result;

        return result;
    }

    public static Long fib(int n){
        if (n <= 2){
            return 1L;
        }
        return fib(n-1) + fib(n-2);
    }
}
