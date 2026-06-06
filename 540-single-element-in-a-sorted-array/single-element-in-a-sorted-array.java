class Solution {
    public int singleNonDuplicate(int[] nums) {
         int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 != 0) mid--; // force mid to even

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;  // pair is normal, single on right
            } else {
                end = mid;        // pair broke, single on left (mid could be answer)
            }
        }

        return nums[start];
    }
}