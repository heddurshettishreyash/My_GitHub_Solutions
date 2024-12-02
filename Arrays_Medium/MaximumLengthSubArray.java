package Arrays_Medium;

import java.util.HashMap;

/*
 *Problem Description
The task is to find the maximum length of a subarray where the count of 0s equals the count of 1s.

Approach
Transform the Problem:

Convert the binary array into a problem of finding a subarray with a sum of 0 by replacing all 0s with -1.
This is because the cumulative sum (or prefix sum) will help identify such subarrays efficiently.
Use a HashMap:

A HashMap is used to store the first occurrence of each prefix sum (sum) along with its index.
If the same prefix sum occurs again, it implies that the subarray between these two occurrences has a sum of 0.
Iterate through the Array:

Calculate the cumulative sum (sum) while iterating.
Check for these cases:
If sum is 0: The subarray from the start of the array to the current index has an equal number of 0s and 1s.
If sum exists in the HashMap: Compute the length of the subarray (i - map.get(sum)).
Otherwise, store the first occurrence of sum in the HashMap.
Update the Maximum Length:

Update subleng with the maximum subarray length found so far.
Example Walkthrough
For the input nums = [0, 1, 0, 0, 1, 1, 0]:

Transform nums to [-1, 1, -1, -1, 1, 1, -1].
Iterate:
At i = 0: sum = -1, store -1:0.
At i = 1: sum = 0, subleng = 2 (subarray [0, 1]).
At i = 2: sum = -1, subleng = 2 (no update, -1 is already in the map).
At i = 4: sum = 0, subleng = 6 (subarray [0, 1, 0, 0, 1, 1]).
Final result: subleng = 6.
Complexity Analysis
Time Complexity:

The solution processes each element of the array once.
O(n) where n is the size of the array.
Space Complexity:

The HashMap stores at most n prefix sums.
O(n). 
 */
public class MaximumLengthSubArray {
    class Solution {
        public int findMaxLength(int[] nums) {
            int n = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int subleng = 0;
            for (int i = 0; i < n; i++) {
                sum += nums[i] == 0 ? -1 : 1;
                if (sum == 0) {
                    subleng = i + 1;
                } else if (map.containsKey(sum)) {
                    subleng = Math.max(subleng, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
            return subleng;
        }

    }
}
