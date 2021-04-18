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
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null) return 0;
        return helper(root,root.left,0)+helper(root,root.right,0);
    }
    int helper(TreeNode gp, TreeNode p, int sum){
        if(gp==null || p==null) return sum;
        if(gp.val%2==0 && p.left!=null) sum+=p.left.val; 
        if(gp.val%2==0 && p.right!=null) sum+=p.right.val; 
        sum=helper(p,p.left,sum);
        sum=helper(p,p.right,sum);
        return sum;
    }
}