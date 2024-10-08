class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i: arr)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i, 1);
        }

        HashSet<Integer> set=new HashSet<>();
        for(int i: map.keySet())
        {
            if(set.contains(map.get(i)))
                return false;
            set.add(map.get(i));
        }
        return true;
    }
}