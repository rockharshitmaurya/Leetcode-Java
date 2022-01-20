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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        helper(root,new StringBuilder(),res);
        return res;
    }
    void  helper(TreeNode root,StringBuilder str,List<String> res){
        if(root==null) return;
        int len=str.length();
        str.append(root.val); 
        if(root.left==null && root.right==null){
            res.add(str.toString());
        
        }else{
        str.append("->");
        helper(root.left,str,res);
        helper(root.right,str,res);
        }
        str.setLength(len);

    }
}