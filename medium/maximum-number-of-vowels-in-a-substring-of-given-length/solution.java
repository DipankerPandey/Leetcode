class Solution {
    public int maxVowels(String s, int k) {
        String vowels="aeiou";
        int wNum=0;
        
        for(int i=0;i<k;i++)
        {
            wNum= (vowels.indexOf(s.charAt(i))!=-1) ? wNum+1 : wNum;
        }

        int mNum=wNum;

        for(int i=k;i<s.length();i++)
        {
            if(vowels.indexOf(s.charAt(i-k))!=-1)
                wNum--;
            if(vowels.indexOf(s.charAt(i))!=-1)
                wNum++;
            mNum=Math.max(wNum,mNum);
        }

        return mNum;
    }
}