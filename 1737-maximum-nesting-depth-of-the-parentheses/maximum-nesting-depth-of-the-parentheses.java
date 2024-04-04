class Solution {
    public int maxDepth(String s) {
        int currOpen = 0;
        int maxOpen = 0;

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '(' ){
                currOpen++;
            }
            else if(s.charAt(i) == ')' ){
                currOpen--;
            }
        maxOpen = Math.max(maxOpen,currOpen);
        }
        return maxOpen;
    }
}