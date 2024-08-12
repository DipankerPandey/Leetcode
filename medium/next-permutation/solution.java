class Solution {
    public void nextPermutation(int[] nums) {

        if(nums.length<=1) return;

        int id1=-1, id2;

        for(int i=nums.length-2; i>=0; i--)
        {
            if(nums[i]<nums[i+1])
            {
                id1=i;
                break;
            }
        }

        if(id1<0)
        {
            for (int i = 0; i < nums.length / 2; i++) 
            {
                int temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }
        }

        else
        {
            id2=0;
            for(int i= nums.length-1; i>=0; i--)
            {
                if(nums[i]>nums[id1])
                {
                    id2=i;
                    break;
                }
            }

            int temp = nums[id1];
            nums[id1] = nums[id2];
            nums[id2] = temp;

            Arrays.sort(nums,id1+1,nums.length);
        }
    }
}