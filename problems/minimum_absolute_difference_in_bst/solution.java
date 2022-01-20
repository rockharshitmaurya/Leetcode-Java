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
    Integer prev=null;
    public int getMinimumDifference(TreeNode root) {
        int arr[]=new int[1];
        arr[0]= Integer.MAX_VALUE;
        
        helper(root,arr);
        return arr[0];
        
    }
    void helper(TreeNode root,int arr[]){
        if(root==null) return;
        helper(root.left,arr);
        if(prev!=null) arr[0]=Math.min(arr[0],root.val-prev);
        prev=root.val;
        helper(root.right,arr);
     }
}