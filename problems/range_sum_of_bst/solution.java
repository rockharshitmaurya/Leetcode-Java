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
    public int rangeSumBST(TreeNode root, int low, int high) {
        // int count=0;
        // Queue<TreeNode> q=new LinkedList<TreeNode>();
        // q.add(root);
        // while(q.size()>0){
        //     TreeNode temp=q.remove();
        //     count+=((temp.val>=low) && (temp.val<=high))?temp.val:0;
        //     if(temp.left!=null){
        //         q.add(temp.left);
        //     }
        //     if(temp.right!=null){
        //         q.add(temp.right);
        //     }
        // }
        // return count;
        if(root==null) return 0;
        int v=root.val;
        if(v<low) return rangeSumBST(root.right,low,high);
        else if(v>high) return rangeSumBST(root.left,low,high);
        else return v+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }
}