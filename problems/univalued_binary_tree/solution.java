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
    int val=0;
    public boolean isUnivalTree(TreeNode root) {
        
        return dfs(root,root.val);
        
        
    }
     private boolean dfs(TreeNode n, int v) {
        if (n == null) { return true; }
        if (n.val != v) { return false; }
        return dfs(n.left, v) && dfs(n.right, v);
    }    
}