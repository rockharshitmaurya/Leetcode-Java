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
    public int minCameraCover(TreeNode root) {
        return helper(root)==-1?sum+1:sum;
    }
    // -1 need camera
    // 0 install camera
    // alrdey coverd
    int helper(TreeNode root){
        if(root==null) return 1;
        int l=helper(root.left);
        int r=helper(root.right);
        if(l==-1 || r==-1){ sum++; return 0; }
         if(l==0 || r==0) return 1;
        else return -1;
    }
}