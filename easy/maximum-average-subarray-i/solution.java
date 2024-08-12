class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int cSum = 0;
       for(int i = 0; i < k; i ++) 
           cSum += nums[i];
       double maxSum = cSum;
       for(int i = k; i < nums.length; i ++) {
           cSum += nums[i] - nums[i - k];
           maxSum = Math.max(maxSum, cSum);
       }
       return maxSum / k;
    }
}