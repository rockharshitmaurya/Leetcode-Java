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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        // HashMap<Integer,Boolean> parent =new HashMap<>();
        Set<Integer> children = new HashSet<>();
        TreeNode ans=new TreeNode(0);
        for(int arr[]:descriptions){
            int rt=arr[0];
            int lr=arr[1];
            int is_lr=arr[2];
         // if(parent.get(rt)==null) parent.put(rt,true);
         //    parent.put(lr,false);
            TreeNode root=map.getOrDefault(rt,new TreeNode(rt));
            if(is_lr==1){
                root.left=map.getOrDefault(lr,new TreeNode(lr));
                map.put(lr,root.left);
            }else{
                root.right=map.getOrDefault(lr,new TreeNode(lr));
                map.put(lr,root.right);
            }
            map.put(rt,root);
            children.add(lr);
            
        }
        // for(Map.Entry<Integer,Boolean> mp:parent.entrySet()){
        //         int ret=mp.getKey();
        //         boolean flag=mp.getValue();
        //     if(flag==true) return map.get(ret);
        // }
        for (int key : map.keySet()){
            if (!children.contains(key))
                return map.get(key);
        }
        return map.get(50);
    }
}