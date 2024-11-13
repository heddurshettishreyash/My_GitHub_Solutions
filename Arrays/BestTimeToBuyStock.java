/*
 * Overview
The Stock Max Profit Calculator is a Java-based method designed to determine the maximum profit that can be achieved from a single buy-and-sell operation on a stock, given an array of stock prices over time.

Problem Description
This method calculates the maximum possible profit by finding the optimal day to buy and the optimal day to sell a stock within a given list of daily prices.

Constraints and Assumptions
Single Buy-Sell Transaction: The method assumes that only one buy and one sell transaction are allowed.
Order of Transactions: The buy must occur before the sell.
Input Prices: The input is an array of integers where each element represents the stock price on a particular day. The length of this array can vary, and prices can fluctuate significantly.
Example
Given an input array of prices [7, 1, 5, 3, 6, 4]:

The maximum profit would be 5, achieved by buying at price 1 (on the second day) and selling at price 6 (on the fifth day).
Edge Cases
Constant Prices: If all prices are the same, the maximum profit is 0 since no profitable transaction is possible.
Decreasing Prices: If prices only decrease, the maximum profit is 0 since buying and selling would only incur a loss.
Single Day: With only one day's price, no transaction is possible, so the maximum profit is 0.
Method Explanation
The algorithm works in a single pass through the array of prices, maintaining the minimum price encountered and the maximum profit calculated up to that point:

Track Minimum Price: The method continuously updates the minimum price encountered so far.
Calculate Potential Profit: For each day's price, it calculates the potential profit by subtracting the minimum price from the current price.
Update Maximum Profit: If the calculated profit is greater than the current maximum profit, it updates the maximum profit.
This approach ensures an efficient calculation in O(n) time complexity, where n is the length of the prices array.
 */
class BestTimeToBuyStock{
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        
        return maxProfit;
    }

}