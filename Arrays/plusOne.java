package Arrays;
/*
 * Description
The plusOne function increments a non-negative integer represented as an array of digits. Each element in the array represents a single digit of the integer, with the most significant digit at the start of the array. If the addition of one results in a carry (for example, from 9 to 10), the function manages this by modifying subsequent digits as needed, and expanding the array if required.

How It Works
The function starts from the last digit and moves backward.
If a digit is less than 9, it increments that digit and returns the modified array.
If a digit is 9, it sets that digit to 0 and continues to the next significant digit.
If all digits are 9, a new array with an extra digit is created, with the first digit set to 1 to account for the carry, and the rest set to 0.
Example
Given an input [1, 2, 9], the function will return [1, 3, 0].

For an input like [9, 9, 9], it will return [1, 0, 0, 0] to represent 1000, demonstrating the function’s ability to handle carries across multiple digits.

Applications
This function is useful for handling large numbers stored in arrays where direct integer operations may not be feasible due to size limits. It can be applied in scenarios such as high-precision arithmetic or specialized data processing tasks.

Complexity
Time Complexity: O(n), where n is the number of digits.
Space Complexity: O(n) if an additional digit is needed for the carry.
 */
public class plusOne {
    public int[] plusOne(int[] digits) {
        int x=digits.length;
        int n=digits.length-1;
        int m=digits.length-2;
        for(int i=n;i>=0;i--){
            if(digits[i]<9){
                  digits[i]++;
                  return digits; 
        }
    digits[i]=0;
    }
      int []result=new int[x+1];
      result[0]=1;
      return result;
}
    
}