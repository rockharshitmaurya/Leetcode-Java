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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size(),count=0;
           
            for(int i=0; i<len; i++){
                if(q.peek().left!=null && q.peek().right!=null && q.peek().left.val==x && q.peek().right.val==y || q.peek().left!=null && q.peek().right!=null && q.peek().left.val==y && q.peek().right.val==x) return false;
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                int val=q.poll().val;
                if(val==x || val==y) count++;
                
            }
            if(count==2) return true;
                else if(count>0) return false;
            
        }
        return false;
    }
}