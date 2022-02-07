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
class NodeData{
    int min;
    int max;
    int sum;
    NodeData(int min,int max,int sum){
        this.min=min;
        this.max=max;
        this.sum=sum;
    }
}
class Solution {
    int res=0;
    NodeData findSum(TreeNode root){
        if(root==null){
            return new NodeData(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        NodeData left=findSum(root.left);
        NodeData right=findSum(root.right);
        int max=(left.sum+right.sum+root.val);
        if(left.max<root.val && root.val<right.min){
            res=Math.max(res,max);
            return new NodeData(Math.min(left.min,root.val),Math.max(right.max,root.val),max);
        }
        return new NodeData(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
    }
    public int maxSumBST(TreeNode root) {
        int ans=findSum(root).sum;
        return res;   
    }
}