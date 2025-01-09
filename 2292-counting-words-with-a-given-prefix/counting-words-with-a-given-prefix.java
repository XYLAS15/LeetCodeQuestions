class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = words.length;
        int result = 0;
        int c = pref.length();

        for (int i = 0; i < n; i++) {
            String str = words[i];
            // Check if the word's length is at least as long as the prefix
                if(str.length() >= c){
                     String ans = str.substring(0, c);
                if (ans.equals(pref)) {
                    result++;
                }
                }
               
        }
        return result;
    }
}
