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

    public int goodNodes(TreeNode root) {
    
       return  helper(root,-1000000);
      
    }
    int helper(TreeNode root,int max){
       if(root==null) return 0;
        int ans=root.val>=max?1:0;
        ans+=helper(root.left,Math.max(root.val,max));
        ans+=helper(root.right,Math.max(root.val,max));
        return ans;
    }
}