class Solution {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        // Try all remappings for maximum
        for (char d1 = '0'; d1 <= '9'; d1++) {
            for (char d2 = '0'; d2 <= '9'; d2++) {
                if (d1 == d2) continue;
                String replaced = numStr.replace(d1, d2);
                int value = Integer.parseInt(replaced);
                maxVal = Math.max(maxVal, value);
                minVal = Math.min(minVal, value);
            }
        }

        return maxVal - minVal;
    }
}
