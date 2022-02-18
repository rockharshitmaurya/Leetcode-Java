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
    public TreeNode recoverFromPreorder(String str) {
       int level,val;
        Stack<TreeNode> stack = new Stack<>();
        for(int i=0; i<str.length();){
            for(level=0; str.charAt(i)=='-'; i++){
                level++;
            }
            for(val=0; i < str.length() && str.charAt(i)!='-'; i++){
                val = val * 10 + (str.charAt(i) - '0');
            }
          while(stack.size()>level){
              stack.pop();
          }
            TreeNode node=new TreeNode(val);
            if(!stack.isEmpty()){
                if(stack.peek().left==null){
                    stack.peek().left=node;
                    
                }else{
                    stack.peek().right=node;
                }
            }
            stack.add(node);
            
        }
        while(stack.size()>1){
            stack.pop();
        }
        return stack.pop();
    }
}