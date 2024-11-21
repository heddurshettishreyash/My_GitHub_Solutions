/*
 * Description
The problem involves determining the maximum wealth among multiple customers, where wealth is defined as the sum of money in all accounts owned by a single customer. The input is a 2D array accounts, where accounts[i][j] represents the amount of money the i-th customer has in the j-th bank account. The task is to return the maximum wealth any customer has.

Approach
Initialization:

Start with a variable ans initialized to the smallest possible integer value (Integer.MIN_VALUE) to track the maximum wealth.
Iterate Through Each Customer:

Loop through the outer array (accounts.length) to process each customer.
For each customer, calculate their total wealth by summing all values in their corresponding row.
Update Maximum Wealth:

Compare the current customer’s total wealth with ans.
Update ans if the current sum is greater.
Return Result:

After processing all customers, ans contains the maximum wealth.
Logic
The logic relies on summing elements in each row of the 2D array to compute individual wealths and maintaining a global maximum (ans). The nested loop structure ensures that every element in the matrix is visited once, allowing us to handle all customer-bank relationships effectively.

Time Complexity
Outer Loop: Iterates through accounts.length customers.
Inner Loop: Iterates through accounts[i].length bank accounts for each customer.
Total Complexity: 

O(m⋅n), where:
𝑚
m: Number of customers (rows in the matrix).

n: Number of bank accounts per customer (columns in the matrix).
Space Complexity
Auxiliary Variables:
ans: Stores the maximum wealth (constant space).
sum: Stores the wealth of the current customer (constant space).
Total Space: 
O(1) (constant).
 */


public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<accounts.length;i++){
             int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
