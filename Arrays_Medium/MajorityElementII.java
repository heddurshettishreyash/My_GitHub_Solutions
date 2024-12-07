/*
 * Problem Description:
The task is to find all elements in an array that appear more than n/3 times, where n is the size of the array. The function should return a list of these majority elements.

Approach:

Use a HashMap to count the frequencies of all elements in the array.

Traverse the array.
If an element exists in the HashMap, increment its count.
Otherwise, add the element to the HashMap with a count of 1.
Iterate through the HashMap entries to check which elements have a frequency greater than n/3.

Add such elements to the result list.
Return the result list.

Time Complexity:

Building the HashMap: O(n).
Iterating through the HashMap: O(n).
Overall Time Complexity: O(n).
Space Complexity:

The HashMap uses O(n) space.
The result list uses O(k) space, where k is at most 2 (because there can be at most 2 elements with frequency > n/3).
Overall Space Complexity: O(n).
 */

public class MajorityElementII {
    public static void main(String[] args) {

    }
}