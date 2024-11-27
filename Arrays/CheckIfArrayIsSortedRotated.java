/*
 * 
Problem Statement:-
Given an integer array nums, determine if it is sorted in non-decreasing order and rotated at some pivot index. A rotated array means a subarray is moved from the end to the start. For example:

[3, 4, 5, 1, 2] is rotated and sorted.
[1, 2, 3, 4, 5] is sorted but not rotated.
[2, 1, 3, 4, 5] is neither rotated nor sorted.
Return true if the array meets the conditions, otherwise false.

Approach
Count Breakpoints:

Iterate through the array and count occurrences where nums[i-1] > nums[i].
Each such occurrence indicates a breakpoint where the order is not maintained.
Handle Circular Comparison:

Additionally, compare the last element (nums[n-1]) with the first element (nums[0]) to account for the circular nature of rotation.
Validation:

If there is more than one breakpoint, the array is not rotated and sorted. Return false.
If there is zero or one breakpoint, return true.
Complexity Analysis

Time Complexity:
O(n), where 
n is the size of the input array. This is due to the single iteration over the array.
Space Complexity:
O(1), as no additional data structures are used.
 */

public class CheckIfArrayIsSortedRotated {
    public boolean check(int[] nums) {
        int track = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                track++;
            }
        }
        if (nums[n - 1] > nums[0]) {
            track++;
        }
        if (track > 1) {
            return false;
        }
        return true;
    }
}
