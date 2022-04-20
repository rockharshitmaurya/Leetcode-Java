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
class BSTIterator {
    Stack<TreeNode> q;
    public BSTIterator(TreeNode root) {
        q=new Stack<>();
        dfs(root);
    }
    
    public int next() {
        TreeNode temp=q.pop();
        dfs(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        return !q.isEmpty();
    }
    void dfs(TreeNode root){
        for(; root!=null; q.push(root), root=root.left);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */