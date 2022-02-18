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
class FindElements {
       private BitSet sets = new BitSet();
    
    public FindElements(TreeNode root) {     
        init(root, 0);
    }
    
    private void init(TreeNode node, int target) {
      if (node != null)  {
          
          node.val = target;
          sets.set(target);
          init(node.left, 2*target +1);
          init(node.right, 2*target +2);
      }      
    }
    
    public boolean find(int target) {
        
        return sets.get(target);        
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */