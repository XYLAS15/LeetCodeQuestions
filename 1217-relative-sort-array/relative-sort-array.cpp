class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        int maxVal = 0;  // Rename max to maxVal to avoid conflict with the std::max function
        int n = arr1.size();
        int m = arr2.size();
        
        // Find the maximum value in arr1
        for(int i = 0; i < n; i++) {
            maxVal = max(maxVal, arr1[i]);
        }

        // Create and fill the count array
        vector<int> countArr(maxVal + 1, 0);
        for(int i = 0; i < n; i++) {
            int ele = arr1[i];
            countArr[ele]++;
        }

        // Place elements of arr2 in arr1 in the required order
        int j = 0;
        for(int i = 0; i < m; i++) {
            int ele = arr2[i];
            while(countArr[ele] > 0) {
                arr1[j] = ele;
                j++;
                countArr[ele]--;
            }
        }

        // Place remaining elements in arr1 in sorted order
        for(int i = 0; i < maxVal + 1; i++) {
            while(countArr[i] > 0) {
                arr1[j] = i;
                j++;
                countArr[i]--;
            }
        }

        return arr1;
    }
};
