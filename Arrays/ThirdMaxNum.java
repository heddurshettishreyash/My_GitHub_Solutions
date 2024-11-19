/*
 * 
Function: thirdMax

The thirdMax function aims to find the third-largest unique number in an array of integers. It handles edge cases where the third largest number does not exist by returning the maximum value in the array instead.

Key Points:
Purpose: Identify the third maximum unique integer in the input array.
Logic:
The function uses three variables (m1, m2, m3) to track the first, second, and third largest unique numbers in the array, respectively.
It iterates through the array, updating these variables only when a number is larger than the current maximum values and isn't a duplicate.
If the third maximum does not exist (less than three unique numbers), it returns the largest value (m1).
Edge Cases:
The array contains fewer than three unique elements.
All elements in the array are identical.
Time Complexity:
O(n), where n is the length of the input array. The function iterates through the array once, ensuring optimal performance.
Space Complexity:
O(1), as only a constant amount of extra space is used to store the three largest unique numbers.
 */
public class ThirdMaxNum {
    public int thirdMax(int[] nums) {
        Integer m1=null;
        Integer m2=null;
        Integer m3=null;
        for(Integer n:nums){
         if(n.equals(m1)||n.equals(m2)||n.equals(m3))continue;
         if(m1==null||n>m1){
             m3=m2;
             m2=m1;
             m1=n;
         }else if(m2==null||n>m2){
             m3=m2;
             m2=n;
 
         }else if(m3==null||n>m3){
             m3=n;
         }
        }
        return m3==null ?m1:m3;
 
     }
    
}
