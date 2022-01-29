/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    TreeNode prev=null;
    public int pairSum(ListNode head) {
        ListNode slow=head,fast=head;
        while(slow.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=helper(slow.next);
        int max=Integer.MIN_VALUE;
        slow=slow.next;
        while(slow!=null){
            max=Math.max(max,(head.val+slow.val));
            slow=slow.next;
            head=head.next;
        }
            return max;
    }
    ListNode helper(ListNode root){
       ListNode prevHead=null;
        while(root!=null){
            ListNode recordNext=root.next;
            root.next=prevHead;
            prevHead=root;
            root=recordNext;
        }
        return prevHead;
        
    }
}