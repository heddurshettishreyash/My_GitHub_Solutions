package Arrays;
/**
 * Problem: Palindrome Number
 *problem link:https://leetcode.com/problems/palindrome-number/
 * Determine if a given integer is a palindrome. An integer is a palindrome when it reads
 * the same backward as forward. For example, 121 is a palindrome, while 123 is not.
 * 
 * Approach:
 * - Reverse the given integer.
 * - Compare the original integer with the reversed integer.
 * - If they are the same, the number is a palindrome.
 *
 * Edge Cases:
 * - Negative numbers are not palindromic (e.g., -121).
 * - Numbers ending with 0 that are not 0 are not palindromic (e.g., 10).
 *
 * Complexity:
 * - Time Complexity: O(log10(n)), where n is the integer, due to dividing the number by 10 each iteration.
 * - Space Complexity: O(1), only a few additional variables are used.
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        int orignal=x;
        int reversed=0;
        while(x>0){
            int digit=x%10;
            reversed =reversed*10+digit;
            x /=10;
        }
        return orignal==reversed;
   }
    
}
