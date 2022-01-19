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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
     ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        isLeaf(root1,arr);
        isLeaf(root2,arr2);
        if(arr.size()!=arr2.size()) return false;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)!=arr2.get(i)){
                return false;
            }
        }
        return true;
    }
    void isLeaf(TreeNode root,ArrayList arr){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
        }
        isLeaf(root.left,arr);
        isLeaf(root.right,arr);
    }
}