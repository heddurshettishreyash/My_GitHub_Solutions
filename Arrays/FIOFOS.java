
/* 
 We are given two strings: haystack and needle. The goal is to find the first occurrence of needle in haystack. If needle is found, return its starting index; otherwise, return -1.

Approach
Traverse through the haystack string.
For each character in haystack, compare it with the first character of needle.
If characters match, continue comparing subsequent characters of both strings.
If a mismatch occurs, reset and start from the next character in haystack.
If the entire needle is found, return the starting index.
If no match is found, return -1.

Time & Space Complexity
Time Complexity: O(n * m) where n is the length of haystack and m is the length of needle. In the worst case, we compare each character of haystack with all of needle.
Space Complexity: O(1), as we only use a few variables to track indices and comparisons.
 */
public class FIOFOS {
    public int strStr(String haystack, String needle) {
        int hle=haystack.length();
        int nele=needle.length();
        int n=0;
        for(int i=0;i<hle;i++){
            if(haystack.charAt(i)==needle.charAt(n)){
                n++;
            }else{
                i=i-n;
                n=0;
            }if(n==nele){
                return i-nele+1;
            }
        }
        return -1;
    }

    
}
