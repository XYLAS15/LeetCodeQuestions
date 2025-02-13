class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num : nums) {
            pq.add((long)num);
        }
        int operations = 0;

        while(pq.peek() < k) {
            if(pq.size() < 2) return -1;
    

        long SmallestElement = pq.poll();
        long secondSmallestElement = pq.poll();

        long newElement = SmallestElement * 2 + secondSmallestElement;
        pq.add(newElement);
        operations++;

        }
        return operations;

    }
}