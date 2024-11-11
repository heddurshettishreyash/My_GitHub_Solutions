/*
 * Problem
Given a sorted array nums and a target target, return the index if the target is found. If not, return the index where it should be inserted to keep the array sorted. The algorithm should run in O(log n) time.

Approach
Use binary search:
If target is found, return its index.
If not, return the insertion index where target would maintain sorted order.
Complexity
Time: O(log n)
Space: O(1)
 */
public class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length-1;
        int m=0;
        while(m<=n){
            int mid =(m+n)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                n=mid-1;
            }else{
                m=mid+1;
            }
        }
        return m;
      
    }
}
