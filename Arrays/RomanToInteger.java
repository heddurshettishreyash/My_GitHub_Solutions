package Arrays;
/*
Problem name:Roman TO Integer
Problem link:https://leetcode.com/problems/roman-to-integer/description/
Convert a Roman numeral string into an integer. The Roman numerals are represented by characters ('I', 'V', 'X', 'L', 'C', 'D', 'M') with the following values:

I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
Approach
Iterate through the String: Loop through each character in the Roman numeral string.

Check the Next Character:

For each character, check if there’s a following character with a higher value.
If the next character has a higher value, subtract the current character’s value from this higher value and add this result to the total.
If the next character has an equal or lower value, simply add the current character’s value to the total.
Update the Index: If a subtractive combination (like "IV" or "IX") is found, move to the next character after the pair; otherwise, proceed to the next character in sequence.

Output the Total: Once the loop completes, the accumulated result represents the integer equivalent of the Roman numeral.

Example Walkthrough
For the Roman numeral "MCMXCIV":

M (1000) followed by C (100): Add 1000.
CM (900) since M > C: Add 900.
XC (90) since C > X: Add 90.
IV (4) since V > I: Add 4.
This totals to 1994.

Complexity
Time Complexity: O(n), where n is the length of the string. Each character is processed only once.
Space Complexity: O(1), as only a few integer variables are used.

 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = getValue(currentChar);

            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = getValue(nextChar);

                if (nextValue > currentValue) {
                    num += (nextValue - currentValue);
                    i++; 
                    continue;
                }
            }

       
            num += currentValue;
        }

        return num;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; 
        }
    }
}
