class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Sum of the first window of size k
        for (int i = 0; i < k; i++) {
            sum += nums[i]; 
        }

        int maxSum = sum;

        // Sliding the window from k to end
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];  // Correct sliding window logic
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum / k;
    }
}
