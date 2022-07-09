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
    public boolean evaluateTree(TreeNode root) {
        return dfs(root,root.val);
    }
    boolean dfs(TreeNode root,int val){
        if(root==null){
            if(val==0) return false;
            else return true;
        }
        boolean left=dfs(root.left,root.val);
        boolean right=dfs(root.right,root.val);
        if(root.val==2) return left || right;
        return left && right;
    }
}