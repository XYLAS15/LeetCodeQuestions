class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        String ans = new String();
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}