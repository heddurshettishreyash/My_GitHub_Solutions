/*
 * Problem Description
You are given a non-empty array of integers where every element appears twice except for one. Your task is to find and return the element that appears only once.

Constraints:

You must implement a solution with a linear runtime complexity.
Only one element appears once; all other elements appear exactly twice.
1. Using XOR Operation (Optimal Solution)
The XOR operation has a unique property: a ^ a = 0 and a ^ 0 = a.
By XOR-ing all elements together, pairs of duplicate numbers will cancel each other out, leaving only the unique number.
Steps:
Initialize a variable unique = 0.
Traverse through the array and XOR each element with unique.
After completing the loop, unique will contain the element that appears only once.
2. Nested Loop with Flag (Naive Solution)
For each element, compare it with every other element to check for duplicates.
If an element has no duplicates, return it.
Drawback: This approach has a quadratic time complexity, which is inefficient for large arrays.

Problem Description
You are given a non-empty array of integers where every element appears twice except for one. Your task is to find and return the element that appears only once.

Constraints:

You must implement a solution with a linear runtime complexity.
Only one element appears once; all other elements appear exactly twice.
Approach
1. Using XOR Operation (Optimal Solution)
The XOR operation has a unique property: a ^ a = 0 and a ^ 0 = a.
By XOR-ing all elements together, pairs of duplicate numbers will cancel each other out, leaving only the unique number.
Steps:
Initialize a variable unique = 0.
Traverse through the array and XOR each element with unique.
After completing the loop, unique will contain the element that appears only once.
2. Nested Loop with Flag (Naive Solution)
For each element, compare it with every other element to check for duplicates.
If an element has no duplicates, return it.
Drawback: This approach has a quadratic time complexity, which is inefficient for large arrays.
Example
Input: [4, 1, 2, 1, 2]
Output: 4
Explanation: Every number except 4 appears twice, so 4 is the unique element.
Complexity Analysis
Time Complexity:
Optimal Approach (Using XOR): O(n) since we only need to traverse the array once.
Naive Approach: O(n^2) due to the nested loop for each element comparison.
Space Complexity:
Optimal Approach: O(1) as we use only a single variable.
Naive Approach: O(1) for space, though it is inefficient in terms of time complexity.
 */
public class SingleNumber {
    public int singleNumber(int[] arr) {
        int flag = 0;
        Integer n = 0;
        for (int i = 0; i < arr.length; i++) {
          flag = 0;
          for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j] && i != j) {
              flag++;
              break;
            }
          }
          if (flag == 0) {
            n = arr[i];
            break;
          }
        }
        return n;
        }

        public int singleNumberXOR(int[] nums) {
            int unique=0;
            for(int num:nums){
                unique^=num;
            }
            return unique;
        }
}
