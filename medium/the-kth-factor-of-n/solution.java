class Solution {
    public int kthFactor(int n, int k) {

        int c=0;
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                c++;
                if(c==k)
                    return i;
            }
        }        
        c++;
        if(c==k)
            return n;

        return -1;
    }
}