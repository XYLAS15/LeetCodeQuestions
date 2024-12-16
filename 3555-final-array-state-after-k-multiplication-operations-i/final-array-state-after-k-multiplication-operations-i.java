

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // Perform k operations
        for (int i = 0; i < k; i++) {
            // Find the smallest element and its index
            int minIndex = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Replace the smallest element with its multiplied value
            nums[minIndex] *= multiplier;
        }
        
        return nums;
    }
}
