class Solution {
    public boolean increasingTriplet(int[] nums) {

        if(nums.length <= 2)
            return false;

        int least=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;

        for(int large : nums)
        {
            if(large <= least)
                least = large;
            
            else if(large <= mid)
                mid = large;

            else
                return true;
        }
        return false;
    }
}