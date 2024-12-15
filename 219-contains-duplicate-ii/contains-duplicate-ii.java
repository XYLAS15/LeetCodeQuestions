class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //hashmap for containing values and indices
        Map<Integer,Integer>map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            //if the integer is present in the map
            if(map.containsKey(nums[i])){
                int previousIndex = map.get(nums[i]);
                if(i - previousIndex <= k) {
                    return true;
                }
            }
            // it's updating the last seen index
            map.put(nums[i], i);
      
        }
              return false;
    }
}