class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        int maxi = 0;
        int mini = s.length();

        for(char ch: s.toCharArray()){
            arr[ch - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]%2 != 0){
                maxi = Math.max(maxi,arr[i]);
            }
            if(arr[i]%2 ==0 && arr[i]>0){
                mini = Math.min(mini, arr[i]);
            }
        }
        return maxi-mini;
    }
}