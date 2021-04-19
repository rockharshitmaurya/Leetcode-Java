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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // return helper(nums,0,nums.length-1);
        Deque<TreeNode> stack=new LinkedList<>();
        
        for(int i=0; i<nums.length; i++){
            TreeNode cur=new TreeNode(nums[i]);
            while(!stack.isEmpty() && stack.peek().val<nums[i]){
                cur.left=stack.pop();
            }
            if(!stack.isEmpty()){
                stack.peek().right=cur;
            }
            stack.push(cur);
        }
        return stack.isEmpty()?null:stack.removeLast();
    }
//     TreeNode helper(int arr[], int start,int end){
//         if(start>end) return null;
//        int idxMax = end;
//         for (int i = start; i < end; i++) {
//             if (arr[i] > arr[idxMax]) {
//                 idxMax = i;
//             }
//         }
//         TreeNode root=new TreeNode(arr[idxMax]);
        
//         root.right = helper(arr, idxMax + 1, end);
//      root.left = helper(arr, start, idxMax - 1);
//         return root;
//     }
}