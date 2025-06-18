class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        if (n % 3 != 0) return new int[0][];
        
        Arrays.sort(nums);
        int[][] result = new int[n / 3][3];
        int idx = 0;

        for (int i = 0; i < n; i += 3) {
            int min = nums[i];
            int max = nums[i + 2];
            if (max - min > k) {
                return new int[0][];
            }
            result[idx][0] = nums[i];
            result[idx][1] = nums[i + 1];
            result[idx][2] = nums[i + 2];
            idx++;
        }

        return result;
    }
}