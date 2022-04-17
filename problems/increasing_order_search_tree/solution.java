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
    TreeNode cur=null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return root;
        TreeNode res=new TreeNode(0);
        cur=res;
        help(root);
        return res.right;
    }
    void help(TreeNode root){
        if(root==null) return;
        help(root.left);
        cur.right=root;
        root.left=null;
        cur=root;
        help(root.right);
    }
}