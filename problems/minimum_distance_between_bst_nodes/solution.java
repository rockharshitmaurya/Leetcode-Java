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
    
    public int minDiffInBST(TreeNode root) {
    int arr[]=new int[2]; 
    arr[0]=Integer.MAX_VALUE;
    arr[1]=-1;
    helper(root,arr);
    return arr[0];
    }
    void helper(TreeNode root,int arr[]){
        if(root==null) return;
        
        helper(root.left,arr);
        if(arr[1]!=-1) arr[0]=Math.min(arr[0],(root.val-arr[1]));
        arr[1]=root.val;
        helper(root.right,arr);
    }
}