class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums,0,new ArrayList<>());
        return res;
    }
    public void findSubsets(int[] nums, int i, List<Integer> subList) {
        //base case
        if(i == nums.length){
            res.add(new ArrayList<>(subList));
            return;
        }
        //pick
        subList.add(nums[i]);
        findSubsets(nums,i+1,subList);
        //remove
        subList.remove(subList.size()-1);
        //no pick
        findSubsets(nums,i+1,subList);
    }
}