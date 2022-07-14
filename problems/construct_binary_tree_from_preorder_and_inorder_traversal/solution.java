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
    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        int len=inorder.length;
        for(int i=0; i<len; i++){
            map.put(inorder[i],i);
        }
        return makeTree(preorder,0,len-1,inorder,0,len-1);
    }
    TreeNode makeTree(int pre[],int preStart,int preEnd,int inorder[],int inStart,int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(pre[preStart]);
        int inRoot=map.get(root.val);
        int numsLeft=inRoot-inStart;
        root.left=makeTree(pre,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1);
        root.right=makeTree(pre,preStart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd);
        return root;
    }
}