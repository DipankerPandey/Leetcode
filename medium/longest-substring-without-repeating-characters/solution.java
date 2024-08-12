class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashSet<Character> cSet = new HashSet<>();
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            if (!cSet.contains(s.charAt(j))) {
                cSet.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
            } else {
                while (cSet.contains(s.charAt(j))) {
                    cSet.remove(s.charAt(i));
                    i++;
                }
                cSet.add(s.charAt(j));
            }
        }
        
        return maxLength;
    }
}