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
    public int maxLevelSum(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
        int level=1,min=Integer.MIN_VALUE,tlevel=0;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int temp=0;
            tlevel++;
            for(int i=0; i<size; i++){
                TreeNode node=q.poll();
                temp+=node.val;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            // System.out.println(temp);
            if(temp>min){
                min=temp;
                level=tlevel;
            }
        }
        return level;
    }
}