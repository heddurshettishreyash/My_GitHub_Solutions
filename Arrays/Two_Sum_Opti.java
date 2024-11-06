package Arrays;
import java.util.*;
/*
 * Problem Statement:
Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

Approach:
Optimized Approach (Hash Map):

The brute force approach had a time complexity of O(n^2), but using a hash map allows us to reduce the time complexity to O(n).
We can iterate through the array while maintaining a hash map to store previously encountered numbers and their corresponding indices.
For each number in the array, we compute the complement (i.e., target - current number), and check if this complement is already in the hash map.
If it is, we return the index of the complement and the current index.
If not, we add the current number and its index to the map for future reference.
Steps:

Create an empty hash map to store the numbers and their indices.
For each element nums[i]:
Compute the complement (target - nums[i]).
If the complement is already in the map, return the indices of the complement and the current element.
Otherwise, add the current element and its index to the map.
If no solution is found, return an empty array.

Time Complexity:
Time Complexity: O(n)

The algorithm iterates over the array once, and each map operation (check if a key exists and insert a key) takes constant time, i.e., O(1). Thus, the overall time complexity is linear, i.e., O(n), where n is the number of elements in the array.
Space Complexity: O(n)

We use a hash map to store up to n elements, resulting in a space complexity of O(n), where n is the number of elements in the array.
 */

public class Two_Sum_Opti {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
           int comp=target-nums[i];
           if(map.containsKey(comp)){
            return new int[]{map.get(comp),i};
           }
           map.put(nums[i],i);
        }
return new int[]{};
    }
}
