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
    public int pseudoPalindromicPaths (TreeNode root) {
        int arr[]=new int[1];
        helper(root,new HashMap<Integer,Integer>(),arr);
        return arr[0];
    }
    
    void helper(TreeNode root,HashMap<Integer,Integer> map,int arr[]){
        if(root==null) return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        if(root.left==null && root.right==null){
            int count=0;
            for(int val:map.values()){
                if(val%2!=0) count++;
            }
            if(count<=1) arr[0]++;
        }
        helper(root.left,map,arr);
        helper(root.right,map,arr);
        map.put(root.val,map.getOrDefault(root.val,0)-1);
    }
}