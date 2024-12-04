package Arrays_Medium;

/*Description of Kadane's Algorithm
Kadane's Algorithm is a dynamic programming technique used to solve the Maximum Subarray Problem. The problem aims to find the contiguous subarray within a one-dimensional numeric array that has the largest sum.

Approach
Initialization:

Start with two variables:
sum to store the sum of the current subarray, initialized to 0.
max to store the maximum sum encountered so far, initialized to Integer.MIN_VALUE.
Iterate Through the Array:

For each element in the array, add it to the sum.
Update max by comparing it with the sum.
If at any point the sum becomes negative, reset it to 0, as a negative sum cannot contribute to a maximum sum in subsequent subarrays.
Result:

After traversing the array, max will hold the maximum sum of the contiguous subarray.
Time Complexity
Time Complexity: 
O(n)
The algorithm scans through the array exactly once, performing constant-time operations for each element.

Space Complexity: 
O(1)
It uses only a fixed number of variables (independent of input size), making it space-efficient.


 * 
 */
public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
