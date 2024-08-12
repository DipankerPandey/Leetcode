class Solution {
    public int largestAltitude(int[] gain) {

        int mAtt=0, n=gain.length, cAtt=0;

        for(int i=0; i<n; i++)
        {
            cAtt=cAtt+gain[i];
            mAtt= Math.max(cAtt, mAtt);
        }
        return mAtt;
    }
}