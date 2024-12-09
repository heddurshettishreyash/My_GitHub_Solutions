/*
 *   
Problem Description:
    You are given an array coins representing the denominations of coins and an integer amount representing the total amount of money. Your task is to find the minimum number of coins needed to make up that amount.
    If it is not possible to form the amount with the given coins, return -1.
    
Approach:
    This problem is solved using Dynamic Programming with memoization.
    
Steps:
    Recursive Function with Memoization:
    
    Define a helper function coinCount that recursively calculates the minimum number of coins needed for a given amount.
    Base cases:
    If amount == 0, return 0 (no coins are needed for 0 amount).
    If amount < 0, return Integer.MAX_VALUE (not possible to form negative amounts).
    Check if the result for the current amount is already computed and stored in the dp array to avoid redundant calculations.
    Iterate Over Coins:
    
    For each coin in the coins array, recursively calculate the number of coins required for amount - coins[i].
    If a valid result (not Integer.MAX_VALUE) is returned, update the minCoins using 1 + result.
    Memoization:
    
    Store the result for the current amount in the dp array to reuse it in future calls, reducing redundant calculations.
    Final Result:
    
    After calculating the result for the given amount, return it.
    If the result is Integer.MAX_VALUE, it means forming the amount is impossible, so return -1.

 Time Complexity:
    
    Recursive Calls:
    Each subproblem is defined by a unique value of amount.
    With memoization, each subproblem is solved only once.
    Loop Over Coins:
    For each amount, there is a loop over coins, which takes O(coins.length) time.
    Total Time Complexity:
    O(amount * coins.length).
    
Space Complexity:
    
    DP Array:
    The dp array requires O(amount) space.
    Recursion Stack:
    The depth of the recursion stack is proportional to the value of amount.
    Total Space Complexity: O(amount).
    
   
 */
public class CoinChange {

    int dp[];

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ans = coinCount(coins, amount);
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

    int coinCount(int[] coins, int amount) {
        if (amount == 0) {
            return 0; // No coins needed for 0 amount
        }
        if (amount < 0) {
            return Integer.MAX_VALUE; // Not possible for negative amounts
        }

        if (dp[amount] != -1) {
            return dp[amount]; // Return memoized result if exists
        }

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = coinCount(coins, amount - coin);
            if (result != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, 1 + result); // Update minimum coins
            }
        }
        return dp[amount] = minCoins; // Store the result in dp array
    }
}
