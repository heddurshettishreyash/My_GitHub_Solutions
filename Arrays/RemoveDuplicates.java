package Arrays;
/*
 You have a sorted array nums with some repeated numbers. You need to remove these duplicates in-place (without using extra space) and return the count of unique numbers.

For example:

Input: [1, 1, 2]
Output: 2 (with nums modified to [1, 2, _], where _ can be any leftover value).
Solution Approach
Use an Index a to Track Unique Elements:

Start with a = 1. This index will show where to place the next unique number.
Loop Through the Array:

For each number in the array (starting from the second one), check if it’s different from the previous number.
If it’s different, place it at position a and increase a by 1.
Return a as the Count of Unique Elements.

Time: O(n) – it goes through the array once.
Space: O(1) – it uses no extra space.
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int a = 1;
          for(int i=1; i<nums.length; i++){
              if(nums[i] != nums[i-1]){
                  nums[a++] = nums[i];
              }
          }
            return a;
        }
    
}
