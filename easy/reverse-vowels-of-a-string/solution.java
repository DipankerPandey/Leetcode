class Solution {
    public String reverseVowels(String s) {

        String vowels= "aeiouAEIOU";
        char[] word = s.toCharArray();

        int start=0, end=s.length() - 1;

        while(start < end)
        {
            while(start < end && vowels.indexOf(word[start])==-1)
                start++;
            while(start < end && vowels.indexOf(word[end])==-1)
                end--;

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }

        return new String(word);
        
    }
}