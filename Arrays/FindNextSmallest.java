/*
 * Find Next Smallest Letter Greater than Target

This Java-based method efficiently determines the smallest letter in a sorted array that is strictly greater than the given target letter. It handles wrap-around cases by cycling back to the beginning of the array if needed.

Problem Description
Given a sorted array of characters (letters) and a target character (target), the method finds the next smallest letter greater than target. If no such letter exists, the array wraps around, returning the first letter.

Constraints and Assumptions
Sorted Input: The input array letters is sorted in ascending order.
Single Character Target: The target is a single character.
Wrap-around Handling: If target is greater than or equal to the largest letter in the array, the result wraps around to the first character.
Non-Empty Array: The array always contains at least one character.
Example
Input 1:
java
Copy code
letters = {'c', 'f', 'j'}
target = 'd'
Output: 'f' (the smallest letter greater than 'd').

Input 2:
java
Copy code
letters = {'a', 'b', 'c'}
target = 'z'
Output: 'a' (wrap-around to the first letter).

Edge Cases
Wrap-around Needed: If the target is greater than or equal to all letters, the method returns the first letter.
Single Letter Array: If the array contains only one letter, that letter is always returned.
Repeated Letters: The method handles duplicates correctly, skipping over them when searching for the next greatest letter.
Algorithm Explanation
The method employs a binary search strategy for efficient execution:

Initialization:
Two pointers: start = 0 and end = letters.length - 1.
Binary Search:
Calculate mid = start + (end - start) / 2.
If letters[mid] > target, move the end pointer to mid - 1.
Otherwise, move the start pointer to mid + 1.
Wrap-around:
Once the search is complete, start will point to the smallest letter greater than the target.
The wrap-around is achieved with letters[start % letters.length].

Complexity
Time Complexity: 
O(logn) — Efficient due to binary search.
Space Complexity: 
O(1) — No extra space used.
 */
public class FindNextSmallest {
    public char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end =letters.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];//Basically we are returning modulo of that character
    }
}
