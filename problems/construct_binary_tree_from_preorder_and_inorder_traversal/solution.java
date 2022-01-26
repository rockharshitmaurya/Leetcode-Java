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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=inorder.length;
        for(int i=0; i<len; i++){
            map.put(inorder[i],i);
        }
        return makeTree(preorder,0,len-1,inorder,0,len-1,map);
    }
    TreeNode makeTree(int pre[],int preStart,int preEnd,int in[],int inStart,int inEnd,HashMap<Integer,Integer> map){
        if(preStart>preEnd || inStart>inEnd) return null;
        TreeNode root=new TreeNode(pre[preStart]);
        int inRoot=map.get(root.val);
        int numsLeft=inRoot-inStart;
        root.left=makeTree(pre,preStart+1,preStart+numsLeft,in,inStart,inRoot-1,map);
        root.right=makeTree(pre,preStart+numsLeft+1,preEnd,in,inRoot+1,inEnd,map);
        return root;
    }
}