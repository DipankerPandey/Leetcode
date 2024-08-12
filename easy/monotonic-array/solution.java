class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int i=0,j=1,c=2;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[j])
            {
                if(c==2 || c==1)
                    c=1;
                else
                    return false;
            }
            else if(nums[i]>nums[j])
            {
                if(c==2 || c==0)
                    c=0;
                else
                    return false;
            }
            j++;
        }
        return true;
    }
}