class Solution {
    public String removeStars(String s) {
        
        char[] chars=s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : chars)
        {
            if(c!='*')
                stack.push(c);
            else
                stack.pop();
        }

        String result="";
        while(!stack.isEmpty()){
            result = stack.pop().toString()+result;
        }

        return result;

    }
}