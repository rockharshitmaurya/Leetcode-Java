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
    public TreeNode bstToGst(TreeNode root) {
      if(root==null) return null;
        helper(root,0);
        return  root;
    }
    int helper(TreeNode node,int sum){
        if(node==null) return sum;
        node.val+= helper(node.right,sum);
        return helper(node.left,node.val);
    }
}