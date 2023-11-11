class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        int candy_types_no = set<int>(candyType.begin(), candyType.end()).size();
        return candy_types_no > candyType.size()/2 ? candyType.size()/2 : candy_types_no;
    }
};