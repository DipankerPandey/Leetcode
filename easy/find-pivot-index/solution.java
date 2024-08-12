class Solution {
    public int pivotIndex(int[] nums) {

        int leftSum=0, rightSum=0, n=nums.length;

        for(int i=1;i<n;i++)
        {
            rightSum=rightSum+nums[i];
        }
        if(rightSum==leftSum)
            return 0;
        for(int i=1;i<n;i++)
        {
            leftSum=leftSum+nums[i-1];
            rightSum=rightSum-nums[i];
            if(rightSum==leftSum)
                return i;
        }
        return -1;
        
    }
}