class Solution {
    public int longestValidParentheses(String s) 
    {
        int max = 0;
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < n; i++) 
        {
            if (s.charAt(i) == '(') 
                stack.push(i);

            else 
            {
                stack.pop(); // Remove the corresponding '('

                if (stack.isEmpty()) 
                    stack.push(i); // Mark the index as unmatched

                else 
                    max = Math.max(max, i - stack.peek());
            }
        }

        return max;
    }
}