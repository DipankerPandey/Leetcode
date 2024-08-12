/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();

        dfs(root1, t1);
        dfs(root2, t2);

        if (t1.size() != t2.size())
            return false;
        for (int i = 0 ; i < t1.size(); i++) 
        {
            if ((int)t1.get(i) != (int)t2.get(i))
                return false;
        }
        return true;
    }

    private void dfs(TreeNode node, List<Integer> leaves)
    {
        if(node==null)
            return;
        
        if(node.left==null && node.right==null)
        {
            leaves.add(node.val);
            return;
        }

        dfs(node.left, leaves);
        dfs(node.right, leaves);
    }
}