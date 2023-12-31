class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        int n = arr.size();

        priority_queue<pair<int,int>> pq;

        for(int i =0; i<n; i++){
            int diff = abs(arr[i]-x);

            pq.push({diff,arr[i]});

            if(pq.size()>k){
                pq.pop();
            }
        }

        vector<int> res;

        while(!pq.empty()){
            auto p = pq.top();
            res.push_back(p.second);
            pq.pop();
        }

        sort(res.begin(), res.end());

        return res;
    }
};