/*
 * Description
The majorityElement method identifies the majority element in an integer array, if one exists. A majority element is defined as an element that appears more than n/2 times in the array, where n is the size of the array. If no such element exists, the method returns -1.

Example
java
Copy code
int[] arr1 = { 3, 3, 2, 1, 2, 3, 1, 2, 3 };
int result1 = majorityElement(arr1);  // Output: 3

int[] arr2 = { 6, 6, 6, 7, 7, 7 };
int result2 = majorityElement(arr2);  // Output: -1
Approach
Count Elements: Traverse the array and use a HashMap to store each element as a key with its frequency as the value.
Identify Majority: After populating the frequency map, iterate through its entries to find if any element has a frequency greater than n/2.
Return Result: Return the element with the required frequency if found, otherwise return -1.
Time and Space Complexity
Time Complexity: O(n) where n is the length of the array. The method iterates over the array to populate the frequency map and then iterates over the map entries.
Space Complexity: O(n) due to storing elements and their counts in the HashMap.
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
     public int majorityElement(int[] arr) {
    // int[] arr = { 3, 3, 2, 1, 2, 3, 1, 2, 3 };
//    int[] arr = { 6, 6, 6, 7, 7, 7 };
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];
      if (map.containsKey(element)) {
        map.put(element, map.get(element) + 1);
      } else {
        map.put(element, 1);
      }
    }
    int maj=-1;
    for (Map.Entry<Integer, Integer> en:map.entrySet()) {
      if (en.getValue() > arr.length / 2) {
        // System.out.println(en.getKey());
        maj=en.getKey();
        break;
      }
    }
    return maj ; 
    }
    
}
