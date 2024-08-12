class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder trim = new StringBuilder();

        for (char c : s.toCharArray()) 
        {
            if (Character.isLetterOrDigit(c))
                trim.append(Character.toLowerCase(c));
        }
        
        return (trim.toString()).equals(trim.reverse().toString());
    }
}