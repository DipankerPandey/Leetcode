class Solution {
    public int calculate(String s) 
    {
       Stack<Integer> stack = new Stack<Integer>();

        int len = s.length(), result = 0, sign = 1;  

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            //for multi-digit numbers
            if (Character.isDigit(ch)) 
            {
                int op = s.charAt(i) - '0';
                while(i+1<len && Character.isDigit(s.charAt(i+1)))
                {
                    op = 10 * op +s.charAt(i+1) - '0';
                    i++;
                }
                result += op * sign;
            } 

            //change the sign to 1, so when multiply it is positive
            else if (ch == '+') 
                sign = 1;

            //change the sign to -1, so when multiply it is negative
            else if (ch == '-') 
                sign = -1;
            
            //store the result and sign before the opening of bracket to calc the bracket first
            else if (ch == '(')
            {
                stack.push(result);
                stack.push(sign);

                sign = 1;
                result = 0;

            } 

            //calc and change the total result with depending on what is in the stack
            else if (ch == ')') 
                result = result*stack.pop() + stack.pop();
        }

        return result;
    }
}