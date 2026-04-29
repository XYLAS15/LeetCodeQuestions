class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int currentCost = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            
            // Add cost of current character
            currentCost += Math.abs(s.charAt(right) - t.charAt(right));

            // If cost exceeds, shrink window
            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}