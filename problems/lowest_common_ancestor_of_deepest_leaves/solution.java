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
    
    int max=0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        TreeNode p=null,q=null;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            boolean flag=true;
            for(int i=0; i<size; i++){
                TreeNode node=qu.poll();
                if(flag) p=node;
                flag=false;
                q=node;
                if(node.left!=null) qu.offer(node.left);
                if(node.right!=null) qu.offer(node.right);
            }
        }
        return helper(root,p,q);
    }
    TreeNode helper(TreeNode root,TreeNode p,TreeNode q){
       if(root==null || root==p || root==q ) return root;
        TreeNode left=helper(root.left,p,q);
        TreeNode right=helper(root.right,p,q);
        if(left==null) return right;
        else if(right==null) return left;
        else return root;
    }

}