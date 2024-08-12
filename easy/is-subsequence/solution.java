class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int ptr=-1;
        boolean flag=false;

        for(int i=0; i<s.length(); i++)
        {
            inner: for(int j=ptr+1; j<t.length(); j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    ptr=j;
                    flag=true;
                    break inner;
                }
            }
            if(!flag)
                return false;

            flag=false;
        }
        return true;
    }
}