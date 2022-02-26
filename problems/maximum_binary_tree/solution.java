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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
               return helper(nums,0,nums.length-1);
    }
    TreeNode helper(int arr[],int l,int r){
        if(l>r) return null;
        int res[]=getMax(arr,l,r);
        int max=res[0];
        int idx=res[1];
        TreeNode root=new TreeNode(max);
         root.left=helper(arr,l,idx-1);
        root.right=helper(arr,idx+1,r);
        return root;
    }
    int[] getMax(int nums[],int l,int r){
        int max=0,idx=l;
        for(int i=l; i<=r; i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        } 
        return new int[]{max,idx};
    }
}
