class Solution {
    public int[] constructDistancedSequence(int n) {
        
        int[] result = new int[2 * n - 1]; // Array of size 2n - 1 initialized with 0
        boolean[] used = new boolean[n + 1]; // To track used numbers
        backtrack(result, used, n, 0);
        return result;
    }

    private boolean backtrack(int[] result, boolean[] used, int n, int index) {
        if (index == result.length) {
            return true; // Found a valid sequence
        }

        // If current index is already filled, move to the next index
        if (result[index] != 0) {
            return backtrack(result, used, n, index + 1);
        }

        // Try placing numbers from largest to smallest
        for (int i = n; i >= 1; i--) {
            if (!used[i]) {
                if (i == 1) {
                    // Place 1 (only appears once)
                    result[index] = 1;
                    used[1] = true;
                    if (backtrack(result, used, n, index + 1)) return true;
                    result[index] = 0; // Undo placement (backtrack)
                    used[1] = false;
                } else {
                    int secondIndex = index + i;
                    if (secondIndex < result.length && result[secondIndex] == 0) {
                        // Place i at index and index + i
                        result[index] = i;
                        result[secondIndex] = i;
                        used[i] = true; // FIX: should be used[i], not used[1]

                        if (backtrack(result, used, n, index + 1)) return true;

                        // Undo placement (backtrack)
                        result[index] = 0;
                        result[secondIndex] = 0;
                        used[i] = false; // FIX: should be used[i], not used[1]
                    }
                }
            }
        }
        return false; // No valid sequence found
    }

}








