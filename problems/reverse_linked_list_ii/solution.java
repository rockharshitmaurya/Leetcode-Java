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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int step=right-left;
        ListNode fast=head,slow=head,t_slow=head;
        for(int i=1; i<left; i++,right--){
            t_slow=slow;
            slow=slow.next;
            fast=fast.next;
        }
        fast=fast.next;
        ListNode unlink=slow;
        slow.next=null;
        while(right-->1){
            ListNode nxt_link=fast.next;
            fast.next=slow;
            slow=fast;
            fast=nxt_link;
        }

        t_slow.next=slow;
        unlink.next=fast;
        // System.out.println(fast.val+" "+unlink.val);

        return left==1?slow:head;
    }
}