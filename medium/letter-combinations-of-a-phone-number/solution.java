class Solution {
    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty())return Collections.emptyList();
        
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> res= new ArrayList<>();
        
        backtrack("",digits, arr, res);
        return res;
    }

    private void backtrack(String combination, String digits, String[] arr, List<String> res)
    {
        if(digits.isEmpty())
            res.add(combination);
        else
        {
            String letters = arr[digits.charAt(0) - '0'];
            for(char letter : letters.toCharArray())
            {
                backtrack(combination + letter, digits.substring(1), arr, res);
            }
        }
    }
}