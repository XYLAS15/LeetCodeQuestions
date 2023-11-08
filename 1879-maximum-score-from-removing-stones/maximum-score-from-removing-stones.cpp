class Solution {
public:
    int maximumScore(int a, int b, int c) {
        priority_queue<int> basket;
        basket.push(a);
        basket.push(b);
        basket.push(c);
        int ans = 0;
        while(basket.size() > 1){
            int left = basket.top();
            basket.pop();
            int right = basket.top();
            basket.pop();
            left--;
            right--;
            if(left != 0) {
                basket.push(left);
            }
            if(right != 0) {
                basket.push(right);
            }
            ans++;
        }
        return ans;
    }
};