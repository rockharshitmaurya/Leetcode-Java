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
    public int distributeCoins(TreeNode root) {
        helper(root);
        return sum;
    }
    int helper(TreeNode root){
      if(root==null) return 0;
        int l=helper(root.left);
        int r=helper(root.right);
        sum+=Math.abs(l)+Math.abs(r);
        return root.val+l+r-1;
//         if(root.left!=null){
//             if(root.left.val<=0){
//                 sum+=Math.abs(root.left.val-1);
//                 root.val-=Math.abs(root.left.val-1);
//             }
//             else if(root.left.val>1){
//                 int add=root.left.val-1;
//                 root.left.val-=add;
//                 root.val+=add;
//                 sum+=add;
//             }
//         }
//         if(root.right!=null){
//             if(root.right.val<=0){
//                 sum+=Math.abs(root.right.val-1);
//                 root.val=root.val-Math.abs(root.right.val-1);
               
//             }
//             else if(root.right.val>1){
//                 int add=root.right.val-1;
//                 root.right.val-=add;
//                 root.val+=add;
//                 sum+=add;
//             }
//         }
    }
}