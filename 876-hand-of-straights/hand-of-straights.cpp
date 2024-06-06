class Solution {
public:
    bool isNStraightHand(vector<int>& hand, int groupSize) {
        if (hand.size() % groupSize != 0) return false;

        map<int, int> countMap;
        for (int num : hand) {
            countMap[num]++;
        }

        for (auto& entry : countMap) {
            int num = entry.first;
            int count = entry.second;
            if (count > 0) {
                for (int i = 1; i < groupSize; i++) {
                    int nextNum = num + i;
                    if (countMap[nextNum] < count) {
                        return false;
                    }
                    countMap[nextNum] -= count;
                }
            }
        }

        return true;
    }
};