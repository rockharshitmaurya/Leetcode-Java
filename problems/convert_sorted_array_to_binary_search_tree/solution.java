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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        TreeNode root=makeTree(nums,0,nums.length-1);
        return root;
        
    }
    TreeNode makeTree(int arr[],int left,int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=makeTree(arr,left,mid-1);
         node.right=makeTree(arr,mid+1,right);
        return node;
    }
}