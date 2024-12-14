class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        // Edge case: If k == 0, return an array of zeros
        if (k == 0) {
            return new int[n]; // All elements are 0
        }

        // Calculate the absolute value of k
        int absK = Math.abs(k);

        // Create a cumulative sum array to optimize the sum calculation
        int[] cumSum = new int[n + 1]; // Cumulative sum (1-indexed)

        // Calculate the cumulative sum array
        for (int i = 0; i < n; i++) {
            cumSum[i + 1] = cumSum[i] + code[i];
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;

            if (k > 0) {
                // Sum of the next k elements using sliding window technique
                int start = (i + 1) % n;
                int end = (i + k) % n;
                if (start <= end) {
                    sum = cumSum[end + 1] - cumSum[start];
                } else {
                    sum = cumSum[n] - cumSum[start] + cumSum[end + 1];
                }
            } else {
                // Sum of the previous |k| elements using sliding window technique
                int start = (i - absK + n) % n;
                int end = (i - 1 + n) % n;
                if (start <= end) {
                    sum = cumSum[end + 1] - cumSum[start];
                } else {
                    sum = cumSum[n] - cumSum[start] + cumSum[end + 1];
                }
            }

            result[i] = sum;
        }

        return result;
    }
}
