/*
 * Problem Statement:
Given two arrays, nums1 and nums2, return an array of their intersection. Each element in the result must be unique, and the result should be returned in any order.

Problem Explanation:
You are provided with two integer arrays, nums1 and nums2. Your task is to find the common elements between the two arrays and return them as a new array. Each element in the resulting array should appear only once, even if it appears multiple times in both arrays.

Approach:
Use Sets for Unique Elements: First, store the elements of both arrays in sets to ensure uniqueness.
Find Intersection: Use the retainAll() method to get the intersection of the two sets. This will retain only the common elements between both sets.
Store Results: Convert the intersection set back into an array to return the result.
Time and Space Complexity:
Time Complexity: O(n + m), where n is the length of nums1 and m is the length of nums2. The time complexity arises from iterating over both arrays to populate the sets and from the intersection operation.
Space Complexity: O(n + m), as we use two sets to store the elements of both arrays.
 */

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        set1.retainAll(set2);
        int ind=0;
        int result[]=new int[set1.size()];
        for(int e:set1){
            result[ind++]=e;
        }
        return result;

        
    }
    
}
