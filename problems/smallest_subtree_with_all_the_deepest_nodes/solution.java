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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        TreeNode p=null,qu=null;
        while(!q.isEmpty()){
            boolean flag=true;
            int size=q.size();
            for(int i=0; i<size; i++){
            TreeNode node=q.poll();
            if(flag) p=node;
            flag=false;
            qu=node;
            if(node.left!=null) q.offer(node.left);
            if(node.right!=null) q.offer(node.right);
            }
        }
        // System.out.println(p.val+" "+qu.val);
        return (p==qu)?p:helper(root,p,qu);   
    }
    TreeNode helper(TreeNode root,TreeNode p,TreeNode q){
        if(root==null || root==p || root==q ) return root;
        TreeNode left=helper(root.left,p,q);
        TreeNode right=helper(root.right,p,q);
        if(left==null) return right;
        else if(right==null) return left;
        return root;
    }
}