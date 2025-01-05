class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] prefix = new int[26];
        int[] suffix = new int[26];

        // initialize suffix array with character count
        for(char c : s.toCharArray()){
            suffix[c - 'a']++;
        }

        //iterate over string with middle character
        HashSet<String> up = new HashSet<>();

        for(int j = 0; j<n; j++) {
            char middleChar = s.charAt(j);
            suffix[middleChar - 'a']--; // Remove the middle character from the suffix

     // Check valid outer characters for the current middle character
            for(int c=0; c<26; c++) {
                if(prefix[c] > 0 && suffix[c] > 0) {
                    up.add((char) ('a' + c) + ""+ middleChar + (char) ('a' + c));
                }
            }
                // Update prefix array to include the current character
            prefix[middleChar - 'a']++;
        }
        return up.size();
    }
}