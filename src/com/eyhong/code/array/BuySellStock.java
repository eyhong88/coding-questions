package com.eyhong.code.array;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BuySellStock {
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{2,4,1}));
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{2,1,2,1,0,1,2}));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int buy = 0, sell = 0;

        boolean newMin = false;
        int currMin = prices[0], currMax = 0;

        for(int i = 1; i < prices.length; i++){
            int curr = prices[i];
            System.out.println("begin buy/sell: " + buy + " " + sell);
            System.out.println("begin min/max: " + currMin + " " + currMax);
            System.out.println("begin curr: " + curr);

            if(currMin > curr){
                newMin = true;
                currMin = curr;
                currMax = 0;
            }
            else if (currMax < curr){
                newMin = false;
                currMax = curr;
            }

            if(!newMin){
                if((sell - buy) > (currMax - currMin)) continue;
                else {
                    buy = currMin;
                    sell = currMax;
                }
            }

            System.out.println("end buy/sell: " + buy + " " + sell);
            System.out.println("end min/max: " + currMin + " " + currMax);
            System.out.println("end curr: " + curr);
            System.out.println(" ");
        }

        return Math.max((sell - buy), 0);
    }
}
