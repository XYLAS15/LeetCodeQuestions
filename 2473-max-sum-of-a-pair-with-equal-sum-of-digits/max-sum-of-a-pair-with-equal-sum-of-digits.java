class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> sumMap = new HashMap<>();
        int maxSum = -1;

        for(int num: nums) {
            int digitSum = getDigitSum(num);

             if(sumMap.containsKey(digitSum)){
            maxSum = Math.max(maxSum,sumMap.get(digitSum) + num );
   
            sumMap.put(digitSum, Math.max(sumMap.get(digitSum), num));
        }
        else{
            sumMap.put(digitSum,num);
        }
        }
        return maxSum;
       
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}