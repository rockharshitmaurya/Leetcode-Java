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
    public TreeNode bstFromPreorder(int[] po) {
        TreeNode root=new TreeNode(po[0]);
            Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        for(int i=1; i<po.length; i++){
            int num=po[i];
            TreeNode toadd=new TreeNode(num);
            // System.out.println(num+" < "+stack.peek().val);
            if(!stack.isEmpty() && num<stack.peek().val){
                stack.peek().left=toadd;
                
            }else{
               TreeNode p=null;
                while(!stack.isEmpty() && stack.peek().val<num){
                 p=stack.pop();
               }
                // if(!stack.isEmpty())
                p.right=toadd;
            }
            stack.push(toadd);
        }
        // System.out.println(root.left.left.val);
        
        return root;
    }
}