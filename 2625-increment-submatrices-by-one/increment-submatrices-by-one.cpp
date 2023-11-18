class Solution {
public:
    vector<vector<int>> rangeAddQueries(int n, vector<vector<int>>& queries) {
        vector<vector<int> > v(n,vector<int>(n,0));

        for(int i=0; i<queries.size(); i++){
            for(int j=queries[i][0]; j<=queries[i][2]; j++){
                v[j][queries[i][1]]++;
                if((1+queries[i][3]) != n)v[j][queries[i][3]+1]--; 
            }
        }
        for(int i=0; i<n; i++){
            for(int j=1;j<n ; j++){
                v[i][j] += v[i][j-1];
            }
        }
        return v;
    }
};