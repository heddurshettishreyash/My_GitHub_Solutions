package Arrays_Medium;

/*
 * Description:
The sortColors method sorts an array containing integers 0, 1, and 2 in-place using the Counting Sort approach. This method adheres to the problem constraints from the Dutch National Flag Problem, ensuring the array is sorted in linear time without using extra space for sorting.

Approach:
Counting the Elements:

Traverse the array once to count the occurrences of each number (0, 1, and 2).
Maintain three counters: zero, one, and two to store the counts of 0s, 1s, and 2s, respectively.
Overwrite the Array:

Use the counts to overwrite the array in sorted order:
Fill the first zero indices with 0.
Fill the next one indices with 1.
Fill the remaining indices with 2.
In-Place Sorting:

The sorting happens directly in the input array, avoiding the need for extra space.
Complexity:
Time Complexity:

Counting the elements and overwriting the array both take O(n) time, where n is the size of the array.
Total time complexity: O(n).
Space Complexity:

The algorithm uses only constant space (O(1)), as it modifies the array in place without additional data structures.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        // Count occurrences of 0, 1, and 2
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        // Assign values based on counts
        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
        for (int i = zero; i < zero + one; i++) {
            nums[i] = 1;
        }
        for (int i = zero + one; i < nums.length; i++) {
            nums[i] = 2;
        }
    }

}
