public class Solution {
    public int[] replaceElements(int[] arr) {
        int maxVal = -1;  // Initialize the maximum value as -1 for the last element
        
        // Iterate through the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];  // Store the current value before updating it
            arr[i] = maxVal;  // Replace the current element with the max value found so far
            if (current > maxVal) {
                maxVal = current;  // Update the max value if the current value is greater
            }
        }
        
        return arr;
    }
}
