
class Solution {
    public boolean sameSign(int x, int y) {
        if (x < 0 && y < 0)
            return true;
        else if (x > 0 && y > 0)
            return true;
        return false;
    }

    public int[] asteroidCollision(int[] a) {
        int n = a.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.size() == 0 || (stack.peek() < 0 && a[i] > 0) || sameSign(stack.peek(), a[i])) {
                stack.push(a[i]);
            } else {
                while (stack.size() > 0 && stack.peek() > 0 && stack.peek() < Math.abs(a[i]))
                    stack.pop();

                if (stack.size() == 0 || stack.peek() < 0) {
                    stack.push(a[i]);
                } else if (stack.peek() == Math.abs(a[i])) {
                    stack.pop();
                }
            }
        }

        int[] ans = new int[stack.size()];
        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            ans[i] = stack.peek();
            i--;
            stack.pop();
        }
        return ans;
    }
}