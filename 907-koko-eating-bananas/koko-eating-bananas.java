class Solution {
     public int maxOfPile(int []piles) {
            int maxPile = Integer.MIN_VALUE;
            for(int pile:piles){
                 maxPile = Math.max(pile,maxPile);
            }
             return maxPile;
        }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = maxOfPile(piles);
        
        while(start < end) {
            int mid = start + (end - start) / 2;
             int totalTime = 0;
            //
            for(int pile:piles) {
              totalTime += (pile+mid-1)/mid; 
            }

            if(totalTime <= h) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}