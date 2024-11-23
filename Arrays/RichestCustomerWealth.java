/*
 * Maximum Wealth Calculator
Function Declaration
java
Copy code
public int maximumWealth(int[][] accounts)
Description
The maximumWealth function computes the maximum wealth among customers based on their account balances. Each customer’s wealth is the sum of all balances across their accounts.

Approach
Initialization:

Declare a variable ans and initialize it to Integer.MIN_VALUE. This will hold the maximum wealth encountered during the iteration.
Outer Loop (Customer Iteration):

Iterate over each row (i) of the accounts array. Each row corresponds to a customer's account balances.
Inner Loop (Account Iteration):

For each customer, iterate through their accounts (j) and calculate the sum of balances for that customer.
Update Maximum Wealth:

After computing the total wealth (sum) for a customer, compare it with ans. If sum is greater, update ans with the new maximum.
Return Result:

After processing all customers, return the value of ans, which contains the maximum wealth.
Complexity Analysis
Time Complexity
Outer Loop: Runs N times, where N is the number of customers (accounts.length).
Inner Loop: For each customer, runs M times, where M is the number of accounts per customer (accounts[i].length).
Total Complexity: 

O(N×M) (Iterates through all accounts once).
Space Complexity
The 
O(1).
 */

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;  // Initialize to the smallest possible integer value.
    
        for (int i = 0; i < accounts.length; i++) {  // Iterate over each customer.
            int sum = 0;  // Sum to store wealth of the current customer.
            for (int j = 0; j < accounts[i].length; j++) {  // Iterate over all accounts of the customer.
                sum += accounts[i][j];  // Add account balance to the sum.
            }
            ans = Math.max(ans, sum);  // Update the maximum wealth.
        }
    
        return ans;  // Return the maximum wealth.
    }
    
    
}
