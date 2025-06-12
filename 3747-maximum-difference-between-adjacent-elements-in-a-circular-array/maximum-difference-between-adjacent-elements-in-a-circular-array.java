class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n; // next index with circular wrap-around
            maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[j]));
        }
        
        return maxDiff;
    }
}