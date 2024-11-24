/*
 * Check if Array is Rotated and Sorted
Description
This function determines if a given array is a rotated and sorted array. A rotated and sorted array means the array is sorted in non-decreasing order but has been rotated at some pivot point. For example:

[3, 4, 5, 1, 2] is rotated and sorted.
[1, 2, 3, 4, 5] is also considered rotated (no actual rotation).
Approach
Tracking Order Violations:

Traverse the array to count the number of times a pair of adjacent elements violates the sorted order (nums[i-1] > nums[i]).
If the last element of the array is greater than the first element (nums[n-1] > nums[0]), increment the count.
Validation:

If there is more than one violation in the order (more than one pivot point), the array cannot be a rotated and sorted array.
Decision:

Return true if at most one violation is found; otherwise, return false.
Time Complexity
O(n): The function iterates through the array once to check for order violations.
Space Complexity
O(1): The function uses only a few variables for tracking violations and the array's size, requiring constant space.

 */
public class SortedAndRotated {
    public boolean check(int[] nums) {
        int track=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                track++;
            }
        }
        if(nums[n-1]>nums[0]){
            track++;
        }
        if(track>1){
            return false;
        }
        return true;
    }
}
