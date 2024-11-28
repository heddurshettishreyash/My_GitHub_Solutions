package Arrays_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Description
This program solves the Three Sum Problem, where the objective is to find all unique triplets in an array that add up to zero. The solution avoids duplicate triplets and ensures efficient processing by leveraging sorting and a two-pointer technique.

How It Works
Input: An array of integers (nums).
Output: A list of unique triplets where the sum of the three integers is zero.
Approach
Sorting: The input array is first sorted in ascending order. Sorting simplifies the process of skipping duplicates and applying the two-pointer technique.
Iteration:
Loop through each element in the array up to the third last element.
Treat the current element as the first number of the triplet.
Skipping Duplicates: If the current element is the same as the previous element, skip it to avoid duplicate triplets.
Two-Pointer Technique:
Use two pointers (left and right) to find pairs of numbers that, when added to the current number, result in zero.
Adjust the pointers based on whether the sum is less than, greater than, or equal to zero.
Adding Triplets: When a valid triplet is found:
Add it to the result list.
Move the pointers past any duplicate values to ensure unique triplets.
Return the Result: After the loop completes, return the list of triplets.
Features
Efficient: By sorting the array and using a two-pointer approach, the solution avoids unnecessary comparisons and minimizes time complexity.
Handles Duplicates: Ensures that no duplicate triplets are included in the final result.
Generalized: Works for arrays of varying sizes and integers, including negative numbers, positive numbers, and zero.
Complexity
Time Complexity: 
𝑂(𝑛2)
O(n2), where 𝑛
n is the length of the input array. The outer loop runs 

O(n), and the two-pointer operation runs 

O(n) for each iteration.
Space Complexity: 

O(1) (excluding the result list), as it operates in-place on the sorted array.
Example
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]
 */
public class Three_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;

                } else {
                    right--;
                }
            }
        }
        return result;
    }

}
