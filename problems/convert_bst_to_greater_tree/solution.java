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
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;
        dfs(root,new int[]{0});
        return root;
    }
    void dfs(TreeNode root,int set[]){
        if(root==null) return;
        dfs(root.right,set);
        root.val=(set[0]+=root.val);
        dfs(root.left,set);
    }
}