class Solution {
    public int partitionString(String s) {
        
        HashSet<Character> set= new HashSet<Character>();
        int c=0;
        for(char ch : s.toCharArray())
        {
            if(!set.contains(ch))
            {
                set.add(ch);
            }
            else
            {
                c++;
                set.clear();
                set.add(ch);
            }
        }

        return c+1;
    }
}