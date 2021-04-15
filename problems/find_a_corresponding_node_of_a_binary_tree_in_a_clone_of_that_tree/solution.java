/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned==null || cloned.val==target.val) return cloned;
        // if(cloned.val==target.val) return cloned;
        // else{
        //   getTargetCopy(original,cloned.left,target);
        //     getTargetCopy(original,cloned.right,target);
        // }
        
        // System.out.println(cloned.right.val);
        TreeNode res=getTargetCopy(original,cloned.left,target);
        if(res!=null) return res;
        return getTargetCopy(original,cloned.right,target);
    }
}