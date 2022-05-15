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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
      int hight=depth(root);
      dfs(root,hight-1,0);
      return sum;
    }
    int depth(TreeNode root){
        if(root==null) return 0;
        
        int lh=depth(root.left);
        int rh=depth(root.right);
        
        return 1+Math.max(lh,rh);
    }
    void dfs(TreeNode root,int h,int l){
        if(root==null) return;
        if(h==l) sum+=root.val;
        // System.out.println(l);
        dfs(root.left,h,l+1);
        dfs(root.right,h,l+1);
    }
}