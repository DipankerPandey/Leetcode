class Solution {
    public int reverse(int x) {

        int n= Math.abs(x);

        long rev_num = 0;

        while (n!=0)
        {
            int t=n%10;
            rev_num=rev_num*10 + t;
            n=n/10;
        }
        return (rev_num < Integer.MIN_VALUE || rev_num > Integer.MAX_VALUE)? 0 : ((x<0)? (int)(-rev_num) : (int)rev_num);
    }
}