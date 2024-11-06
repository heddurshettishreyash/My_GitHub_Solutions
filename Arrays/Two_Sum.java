package Arrays;
/*Problem Name :Two Sum
Problem Link https://leetcode.com/problems/two-sum/description/
Problem Statement:
Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

Approach:
Brute Force Approach:

We use two nested loops to iterate through each pair of numbers in the array.
For each pair of numbers, we check if their sum equals the target.
If a match is found, we store the indices of the two numbers and return them.
Steps:

Iterate over each element nums[i] of the array.
For each nums[i], iterate over every subsequent element nums[j] (where j > i).
If nums[i] + nums[j] == target, store i and j as the indices of the two numbers and return them.
*/
public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
      
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                
                }
            }
        }
    return result;
}
    
}
