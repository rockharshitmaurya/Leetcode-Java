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
    int ans=0;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        ans=helper(root,root.val,root.val);
        return ans;
    }
    int helper(TreeNode root,int min,int max){
        if(root==null) return max-min;
        
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
        int a=helper(root.left,min,max);
        int b=helper(root.right,min,max);
        return Math.max(a,b);
        
    }
}