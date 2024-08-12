class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Stack<String> stack = new Stack<String>();

        for (String dir : dirs){
            if (dir.equals(".") || dir.isEmpty()){
                continue;
            }
            else if(dir.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                stack.push(dir);
            }
        }
        
        StringBuilder res = new StringBuilder();
        for (String dir : stack) {
            res.append("/");
            res.append(dir);
        }

        return res.length() > 0 ? res.toString() : "/";
    }
}