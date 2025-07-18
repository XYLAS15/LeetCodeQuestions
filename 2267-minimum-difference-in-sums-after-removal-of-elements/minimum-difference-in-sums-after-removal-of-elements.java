class Solution {
    public long minimumDifference(int[] nums) {
        int totalSize = nums.length;
        int n = totalSize / 3;

        // Use long for sums to avoid integer overflow
        // prefixMinSum[i] = sum of n smallest elements in nums[0...i]
        long[] prefixMinSum = new long[totalSize];
        
        // Use a max-heap to keep track of the n smallest elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long currentSum = 0;

        // Left-to-right pass to calculate prefix minimum sums
        for (int i = 0; i < totalSize; i++) {
            maxHeap.offer(nums[i]);
            currentSum += nums[i];
            
            if (maxHeap.size() > n) {
                currentSum -= maxHeap.poll();
            }
            
            if (maxHeap.size() == n) {
                prefixMinSum[i] = currentSum;
            }
        }
        
        // suffixMaxSum[i] = sum of n largest elements in nums[i...3n-1]
        long[] suffixMaxSum = new long[totalSize];

        // Use a min-heap to keep track of the n largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        currentSum = 0;

        // Right-to-left pass to calculate suffix maximum sums
        for (int i = totalSize - 1; i >= 0; i--) {
            minHeap.offer(nums[i]);
            currentSum += nums[i];

            if (minHeap.size() > n) {
                currentSum -= minHeap.poll();
            }
            
            if (minHeap.size() == n) {
                suffixMaxSum[i] = currentSum;
            }
        }
        
        long minDifference = Long.MAX_VALUE;
        
        // Iterate through all possible split points.
        // The split is between index i and i+1.
        // The left part (n elements) is chosen from nums[0...i].
        // The right part (n elements) is chosen from nums[i+1...3n-1].
        // i must be at least n-1 to have n elements for the left part.
        // i must be at most 2n-1 so that i+1 is at most 2n, leaving n elements for the right part.
        for (int i = n - 1; i < 2 * n; i++) {
            long diff = prefixMinSum[i] - suffixMaxSum[i + 1];
            minDifference = Math.min(minDifference, diff);
        }
        
        return minDifference;
    }
}
