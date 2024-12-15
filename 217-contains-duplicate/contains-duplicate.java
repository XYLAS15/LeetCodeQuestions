class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store elements we've seen
        Set<Integer> seen = new HashSet<>();
        
        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the set, return true (duplicate found)
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, add the element to the set
            seen.add(num);
        }
        
        // If we complete the loop, there are no duplicates
        return false;
    }
}
