class Solution {
    public int myAtoi(String s) {

        long n=0;
        boolean neg=false, done=false;
        int m=0;

        while (m < s.length() && s.charAt(m) == ' ') m++;

        loop: for(int i=m;i<s.length();i++)
        {
            if(s.charAt(i)=='-' && done==false)
            {
                done=true;
                neg=true;
                continue loop;
            }
            if(s.charAt(i)=='+' && done==false)
            {
                done=true;
                neg=false;
                continue loop;
            }
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                done=true;
                n= (n*10) + (int)(s.charAt(i)-48);
                if(n>Integer.MAX_VALUE)
                    break;
                if(n<Integer.MIN_VALUE)
                    break;
            }
            else if(s.charAt(i)==' ' && done==false)
            {
                continue loop;
            }
            else
            {
                break;
            }
        }

        if(neg)
            n=-n;
        
        if(n>Integer.MAX_VALUE)
            n=Integer.MAX_VALUE;
        if(n<Integer.MIN_VALUE)
            n=Integer.MIN_VALUE;

        return (int)n;
    }
}