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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(root,list);
        // System.out.println(list);
        return makeTree(list,0,list.size()-1);
    }
    TreeNode makeTree(ArrayList<Integer> list,int left,int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode toadd=new TreeNode(list.get(mid));
        toadd.left=makeTree(list,left,mid-1);
        toadd.right=makeTree(list,mid+1,right);
        return toadd;

        
    
    }
    void helper(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}