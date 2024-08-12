class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();

        for(int i : nums)
            map.put(i,map.getOrDefault(i,0)+1);

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            queue.offer(entry);
        
        int[] ans= new int[k];

        for(int i=0;i<k;i++)
        {
            Map.Entry<Integer, Integer> helper = queue.remove();
            ans[i]=helper.getKey();
        }

        return ans;

    }
    
}