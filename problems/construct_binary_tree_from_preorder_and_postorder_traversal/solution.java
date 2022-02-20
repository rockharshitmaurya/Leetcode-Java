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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
           Deque<TreeNode> q=new ArrayDeque<>();
            q.offer(new TreeNode(pre[0]));
        for(int i=1,j=0; i<pre.length; ++i){
            TreeNode node=new TreeNode(pre[i]);
            while(q.getLast().val==post[j]){
                q.pollLast();
                j++;
            }
            if(q.getLast().left==null) q.getLast().left=node;
            else q.getLast().right=node;
            q.offer(node);
        }
        return q.getFirst();
    }
}