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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        TreeNode toadd1=new TreeNode(v);
        if(d==1){
            toadd1.left=root;
            root=toadd1;
            return root;
        }
        TreeNode toadd2=new TreeNode(v);
        TreeNode temp=root;
        int limit=1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(temp);
        while(!q.isEmpty()){
            int len=q.size();
           // System.out.println(q.peek().val+" "+limit++);
            
            for(int i=0; i<len; i++){
                TreeNode rm=q.remove();
                toadd1=new TreeNode(v);
                toadd2=new TreeNode(v);
                if(d-1==limit){
                System.out.println(rm.val);
                if(rm.left!=null) toadd1.left=rm.left;
                if(rm.right!=null) toadd2.right=rm.right;
                rm.left=toadd1;
                rm.right=toadd2; 
               }
                if(rm.left!=null) q.add(rm.left);
                if(rm.right!=null) q.add(rm.right);
                
            }
            System.out.println();
            limit++;
            if(d==limit) return root;
        }
        
        
        return root;
    }
}