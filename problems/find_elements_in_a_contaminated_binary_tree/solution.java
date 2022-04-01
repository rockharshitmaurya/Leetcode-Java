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
    TreeNode root;
    public FindElements(TreeNode root) {
        this.root=root; 
        // dfs(root,0);
    }
    
    public boolean find(int target) {
        // System.out.println(root.left.left.val);
        return dfs(root,0,target);
    }
    public boolean dfs(TreeNode root,int val,int target){
        if(root==null) return false;
            if(val==target) return true;
            return dfs(root.left,(val*2)+1,target) ||
            dfs(root.right,(val*2)+2,target);
        }
    boolean find(TreeNode root,int val){
        if(root==null) return false;
        if(root.val==val) return true;
        boolean flag1=find(root.left,val);
        boolean flag2=find(root.right,val);
        return (flag1 || flag2);
    }
    }


/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */