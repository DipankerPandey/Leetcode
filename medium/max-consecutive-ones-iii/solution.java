class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0, end=0, c=0, max=Integer.MIN_VALUE;

        while(end<nums.length)
        {
            if(nums[end]==0)
                c++;
        
            while(start<nums.length && c>k)
            {
                if(nums[start]==0)
                    c--;
                start++;
            }
            max=Math.max(max,end-start+1);
            end++;
        }
        return max;
    }
}