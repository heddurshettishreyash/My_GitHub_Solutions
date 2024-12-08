/*
Problem Description:Find all the duplicate numbers in an array where the elements are in the range[1,n],and each integer appears at most twice.The solution should return a list of the duplicate numbers.

Approach:

Cyclic Sort to Place Numbers in Correct Positions:

Traverse the array and place each number at its correct index(i.e.,nums[i]should be at nums[nums[i]-1]).Swap the current number with the number at its target position if they are not already in the correct place.Move to the next index only when the current number is in the correct position.Find Duplicates:

After sorting,if any number nums[index]is not equal to index+1,it means the number appears more than once in the array.Add such numbers to the result list.Return the Result List:

The list will contain all duplicate numbers.Code:

Time Complexity:

Cyclic Sort:

Each number
is placed
at its
correct position
in at
most one swap.Hence,
the sorting
part runs

in O(n).
Finding Duplicates:

Iterating through the array to check the conditions runs in O(n).
Overall Time Complexity: O(n).

Space Complexity:

The algorithm operates in O(1) extra space, as the sorting is done in place and only a result list is used.
Overall Space Complexity: O(1) (excluding the space used by the result list).

import java.util.ArrayList;
import java.util.List;
*/

class FindAllDuplicate {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;

        // Step 1: Cyclic sort
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                // Swap nums[i] and nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find duplicates
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }
}
