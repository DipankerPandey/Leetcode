class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int k=1;
        int max =0;
        if(nums.length<=1)
        return nums.length;
        
        while(i<(nums.length-1))
        { 
            if(nums[i]==nums[i+1])
            {
             i++;
             continue;
            }
           else if((nums[i]+1)!=nums[i+1])
            {
                j++;
                i=j;
                max = Math.max(max,k);
                k=1;
                continue;
            }  
            
         k++; 
         i++;
                    
        }
        max = Math.max(max,k);
        
    return max;
    }
}