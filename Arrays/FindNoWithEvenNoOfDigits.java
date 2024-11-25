/*
 * Find Numbers with Even Number of Digits
Problem Description
The task is to determine how many numbers in a given array have an even number of digits.

For example, in the array [12, 345, 2, 6, 7896], the numbers 12 and 7896 have an even number of digits, so the output would be 2.

Approach
Iterate Through the Array:

Loop through each number in the array.
Count Digits:

For each number, repeatedly divide it by 10 while counting the number of iterations to determine the total digits.
Check for Even Digits:

If the count of digits is even, increment the result counter.
Return the Result:

At the end of the iteration, return the count of numbers with an even number of digits.
Time and Space Complexity
Time Complexity:

O(n * d), where n is the length of the array and d is the average number of digits in the numbers. Each number's digits are processed individually.
Space Complexity:

O(1), as the algorithm uses a constant amount of additional memory.
 */

public class FindNoWithEvenNoOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int coun = 0;
            while (num > 0) {

                num /= 10;
                coun++;
            }
            if (coun % 2 == 0) {
                count++;
            }

        }
        return count;
    }

}