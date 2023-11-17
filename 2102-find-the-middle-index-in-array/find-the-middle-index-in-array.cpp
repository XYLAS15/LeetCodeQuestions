class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
     int n = nums.size();
     int sum = 0;
     int left_ts = 0;
       for(auto i:nums)
        sum+=i;
     for(int i=0; i<n; i++){
         if(left_ts == sum-nums[i])
         return i;
         left_ts += nums[i] ;
         sum -= nums[i] ;
     }
     return -1;
    }
};