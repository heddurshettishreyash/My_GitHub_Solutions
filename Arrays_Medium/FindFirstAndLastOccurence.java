package Arrays_Medium;
/*
 * Description:
The program is designed to find the first and last occurrence of a given target value in a sorted array. If the target value is not present, it returns [-1, -1]. The implementation uses Binary Search twice, once to find the starting index and then to find the ending index, ensuring an efficient solution.

Approach:
Binary Search for Starting Index:

Search for the target value, adjusting the end pointer (end = mid - 1) whenever the target is found. This ensures that the search narrows down to the first occurrence.
Return the index of the first occurrence if found, otherwise -1.
Binary Search for Ending Index:

Search for the target value, adjusting the start pointer (start = mid + 1) whenever the target is found. This ensures that the search narrows down to the last occurrence.
Return the index of the last occurrence if found, otherwise -1.
Combine Results:

Store the results of the starting and ending indices in an array.
Return [-1, -1] if the target is not found.
Complexity:
Time Complexity:

Each binary search runs in O(log n) time, where n is the size of the array.
Since two binary searches are performed, the overall time complexity is O(2 × log n) = O(log n).
Space Complexity:

The algorithm uses only a constant amount of extra space for variables, so the space complexity is O(1).
Example:
Input:
plaintext
Copy code
nums = [5, 7, 7, 8, 8, 10], target = 8
Output:
plaintext
Copy code
[3, 4]
Explanation:
The target 8 first occurs at index 3 and last occurs at index 4.
 */

public class FindFirstAndLastOccurence {
    int Bs(int[] nums, int target, Boolean isstart) {
        int start = 0;
        int ans = -1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }

            else {
                ans = mid;
                if (isstart) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = Bs(nums, target, true);// call Binary search for starting index:true
        int end = Bs(nums, target, false);// call Binary search for starting index:false
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

}
