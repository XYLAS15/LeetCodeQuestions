class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
      List<String> res = new ArrayList<>();

      int[] maxFreq = new int[26];
      for(String word: words2){
        int freq[] = getCharFrequency(word);
        for(int i=0;i<26;i++) {
            maxFreq[i] = Math.max(freq[i], maxFreq[i]);
        }
      }
       for(String word: words1) {
        int freq[] = getCharFrequency(word);
        if(isUniversal(freq, maxFreq)) {
            res.add(word);
        }
       }
       return res;
    }
    private int[] getCharFrequency(String str) {
        int freq[] = new int[26];

        for(char c: str.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    private boolean isUniversal(int[] freq, int[] maxFreq) {
        for(int i=0; i<26; i++) {
            if(freq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}