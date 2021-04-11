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
     int res=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
              
        maxh(root,0);
        return res;
    }
   int maxlevel=0;
    int maxh(TreeNode root,int level){
       if(root==null) return 0;
        if(level>maxlevel){
            res=0;
            maxlevel=level;
        }
        if(level==maxlevel) res+=root.val;
        return Math.max(maxh(root.left,level+1),maxh(root.right,level+1));
    }
}