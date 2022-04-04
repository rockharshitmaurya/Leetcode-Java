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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head,fast=head,fast2=head;
        for(int i=1; i<k; i++){
            slow=slow.next;
            fast2=fast2.next;
        }
        while(fast2.next!=null){
            fast=fast.next;
            fast2=fast2.next;
        }
        int temp=slow.val;
        slow.val=fast.val;
        fast.val=temp;
        
        return head;
    }
}