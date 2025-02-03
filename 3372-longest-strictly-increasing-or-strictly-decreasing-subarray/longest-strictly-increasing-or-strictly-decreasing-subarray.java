class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int I_count = 1;
        int D_count = 1;
        int maxlen = 1;
        if(nums.length == 1) return 1;
        for(int i = 0; i<nums.length -1 ; i++) {
            if(nums[i] < nums[i+1]) {
                I_count++;
                D_count = 1;
            }
            else if(nums[i] > nums[i+1]) {
                  D_count++;
                I_count = 1;
            }
            else {
                D_count = I_count = 1;
            }
            maxlen = Math.max(maxlen,Math.max(I_count,D_count));
        }
        
         return maxlen;
    }
   
}