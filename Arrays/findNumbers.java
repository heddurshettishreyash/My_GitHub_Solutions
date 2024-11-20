/*
 * Purpose
The program is designed to determine how many numbers in an input array have an even number of digits.

How It Works
Input: An array of integers (nums).
Process:
For each number in the array:
Count the number of digits by repeatedly dividing the number by 10.
Check if the total digit count is even.
If the digit count is even, increase the count of valid numbers.
Output: The program returns the count of numbers with an even number of digits.
Key Features
Efficiently iterates through the array and processes each number.
Uses basic arithmetic operations to count digits.
Simple logic to check for even-digit numbers.
Example
Input: [12, 345, 2, 6, 7896]
Output: 2
(Explanation: Numbers with even digits are 12 and 7896.)
 */
public class findNumbers {
    public int findNumbers(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int coun=0;
            while(num>0){
      
            num/=10;
            coun++;
            }
            if(coun%2==0){
                count++;
            }
            
        }
        return count;
    }
}
