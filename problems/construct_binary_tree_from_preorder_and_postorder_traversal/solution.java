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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        HashMap<Integer,Integer> pref=new HashMap<>();
        HashMap<Integer,Integer> postf=new HashMap<>();
        for(int i=0; i<pre.length; i++){
            pref.put(pre[i],i);
            postf.put(post[i],i);
        }
        // System.out.println(pref);
        // System.out.println(postf);
        
        return makeTree(pre,post,0,pre.length-1,pref,postf);
    }
    TreeNode makeTree(int[] pre,int[] post,int lb,int rb,HashMap<Integer,Integer> premap,HashMap<Integer,Integer> postmap){
    if(lb>rb) return null;
        
    TreeNode root=new TreeNode(pre[lb]);
    if(lb==rb) return root;
    int middle=premap.get(post[postmap.get(pre[lb])-1]);
        root.left=makeTree(pre,post,lb+1,middle-1,premap,postmap);
        root.right=makeTree(pre,post,middle,rb,premap,postmap);
        
        
    return root;
        
}
}