/*
 * Find Peak Element
Description:
The function findPeakElement identifies a "peak element" in an array. A peak element is defined as an element that is greater than its immediate neighbors. The function uses a binary search approach to efficiently locate a peak. If the array contains multiple peaks, the function will return the index of any one of them.

Approach
Binary Search:
Use two pointers, start and end, to represent the range of the array being searched.
Calculate the midpoint: mid = start + (end - start) / 2.
Compare arr[mid] with its neighbor arr[mid + 1]:
If arr[mid] > arr[mid + 1]: This indicates that a peak lies on the left side (including the current mid). Move the end pointer to mid.
Else: This indicates that a peak lies on the right side. Move the start pointer to mid + 1.
Continue until start equals end.
Return the Peak Index:
At the end of the loop, start and end converge to the index of a peak element.
Return either start or end.
Complexity
Time Complexity: 
O(logn)
The binary search approach reduces the search space by half in each iteration, making it logarithmic.
Space Complexity: 
O(1)
The algorithm uses constant extra space.
 */
public class PeakELement {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) { // If mid is greater than the next element
                end = mid; // Search in the left part (including mid)
            } else {
                start = mid + 1; // Search in the right part
            }
        }
        return start; // Or end (both point to the peak index)
    }

}
