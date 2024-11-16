
/*
 * Problem Statement
This algorithm identifies two specific numbers in an array:
A duplicate number that appears more than once.
A missing number from the range 1 to n, where n is the length of the array.
The input array contains n integers, but one number is duplicated, and another is missing.

Approach
The solution uses a HashMap to:
Count the occurrences of each number in the array.
Detect the number appearing more than once (duplicate).
Identify the missing number by iterating over the complete range 1 to n.
Key Concepts
HashMap for Counting: Efficiently track the frequency of numbers.
Iteration Over Range: Compare the actual range with the numbers in the map to find discrepancies.
Optimized Space Usage: Use 
O(n) space for the map, avoiding additional structures.
Time Complexity
O(n): Single pass for counting and another pass for identifying the duplicate and missing numbers.
Space Complexity
O(n): Due to the storage requirements of the HashMap.

 */

import java.util.HashMap;

public class SetMismatch {
       public int[] findErrorNums(int[] nums) {
          int ans[] = new int[2]; // Duplicate and missing numbers
         HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each number
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // Find duplicate and missing numbers
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1) {
                    ans[0] = i; // Duplicate number
                }
            } else {
                ans[1] = i; // Missing number
            }
        }
        
        return ans;
    }
}

