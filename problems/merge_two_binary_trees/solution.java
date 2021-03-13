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
    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
       Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(r1);
        stack.push(r2);
        if(r1==null) return r2;
        while(!stack.isEmpty()){
            TreeNode two=stack.pop();
            TreeNode one=stack.pop();
            if(one!=null && two!=null){
                one.val+=two.val;
                if(one.left==null) one.left=two.left;
                else { stack.push(one.left); stack.push(two.left); }
                
                if(one.right==null) one.right=two.right;
                else { stack.push(one.right); stack.push(two.right); }
            }
        }
        return r1;
    }
}