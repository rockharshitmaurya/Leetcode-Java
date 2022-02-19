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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:to_delete) set.add(num);
        ArrayList<TreeNode> list=new ArrayList<>();
        // list.add(helper(root,set,list));
        TreeNode node=helper(root,set,list);
        if(node!=null) list.add(node);
        return list;
    }
    TreeNode helper(TreeNode root,HashSet<Integer> set,ArrayList<TreeNode> list){
        if(root==null) return root;
        
        root.left=helper(root.left,set,list);
        root.right=helper(root.right,set,list);

        if(root!=null && set.contains(root.val)) {
            if(root.left!=null) list.add(root.left);
            if(root.right!=null) list.add(root.right);
            return null;
        }
        return root;

    }
}