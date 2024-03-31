class Solution {
public:
    long long countSubarrays(vector<int>& nums, int minK, int maxK) {
        int minI = -1;
    int maxI = -1;
    long ans = 0;
    int leftBoundary = -1;
    int n = nums.size();
    for(int curr = 0; curr < n; curr++) {
        if(nums[curr] == minK) {
            minI = curr;
        }
        if(nums[curr] == maxK) {
            maxI = curr;
        }
        // check element is out of bound
        if(nums[curr] < minK || nums[curr] > maxK) {
            leftBoundary = curr;
        }
        if(minI != -1 && maxI != -1) {
            int smaller = std::min(minI, maxI);
            if((smaller - leftBoundary) > 0) {
                ans = ans + (smaller - leftBoundary);
            }
        }
    }
    return ans;
}
};