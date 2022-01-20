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
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        StringBuilder str=new StringBuilder();
        helper(root,str);
        return str.toString();
    }
    void helper(TreeNode root,StringBuilder str){
        if(root==null) return;
         str.append(root.val);
        if(root.left==null && root.right==null) return;
       
        str.append("(");
        helper(root.left,str);
        str.append(")");
        if(root.right!=null){
        str.append("(");
        helper(root.right,str);
        str.append(")");
        }
       
        // "1(2(4())3())"
    }
}