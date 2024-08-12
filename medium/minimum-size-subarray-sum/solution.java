class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int cSum=0, i=0, ptr=0, mSum=Integer.MAX_VALUE;
        while(ptr<nums.length)
        {
            cSum=cSum+nums[ptr];
            while(cSum>=target)
            {
                cSum=cSum-nums[i];
                mSum=Math.min(ptr-i+1,mSum);
                i++;
            }
            ptr++;
        }
        return mSum==Integer.MAX_VALUE ? 0 : mSum;
        
 
    }
}