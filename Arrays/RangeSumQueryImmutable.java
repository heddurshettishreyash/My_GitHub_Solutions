/*
 * 303. Range Sum Query - Immutable
Solved
Easy
Topics
Companies
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
Approach:-
    AS we have constructor first initalize single array elements to the particular position of an array 
    Then in sumRange method run a for loop from left to right and calculate sum of each range 

time and space complexity :- o(n)and o(1)
 */

public class RangeSumQueryImmutable {
    class NumArray {
        public int nums[];

        public NumArray(int[] nums) {
            for (int num : nums) {
                this.nums = nums;
            }
        }

        public int sumRange(int left, int right) {
            int ans = 0;
            for (int i = left; i <= right; i++) {
                ans += nums[i];
            }
            return ans;
        }
    }

}
