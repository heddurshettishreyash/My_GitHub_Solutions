package Arrays;

import java.util.ArrayList;

public class Remove_Element {
    /*
     Given an integer array nums and an integer val, you need to remove all
     occurrences of val in nums in-place (without using extra space). Return the number of elements left in the array that are not equal to val.

For example:

Input: nums = [3,2,2,3], val = 3
Output: 2 (with nums modified to [2,2,_,_], where _ represents any leftover value).
Solution Approach
Use a Pointer (count) to Track New Array Position:

Initialize count = 0. This variable will point to where the next "non-val" element should go.
Loop Through the Array:

For each element in nums, if it’s not equal to val, assign it to nums[count] and increment count.
If it’s equal to val, skip that element.
Return count as the Number of Elements Not Equal to val.

Time Complexity: O(n), since it iterates over the array once.
Space Complexity: O(1), as it modifies the array in place.
     */

    public int removeElement(int[] nums, int val) {
        int count =0;
       for(int i=0; i<nums.length; i++){
          if(nums[i] != val){
              int tmp=nums[i];
              nums[count]=nums[i];
              nums[i]=tmp;
              count++;
          }
      }
        return count;
    }
    
}
