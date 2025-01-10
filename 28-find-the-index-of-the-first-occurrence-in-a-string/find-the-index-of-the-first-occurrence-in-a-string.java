class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if(n == 0) return 0;

        if (n > m) return -1;

        for(int i=0; i<=m-n; i++) {
         String ans = haystack.substring(i, i+n);
         if(needle.equals(ans)) {
            return i;
         }
         
        }
            return -1;
    }
}