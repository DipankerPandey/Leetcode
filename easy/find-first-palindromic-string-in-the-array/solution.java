class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        outer: for(int i=0; i<n; i++)
        {
            String a=words[i];
            for(int j=0; j<a.length()/2; j++)
            {
                if(a.charAt(j)!=a.charAt(a.length()-1-j))
                    continue outer;
            }
            return a;
        }
        return "";
    }
}