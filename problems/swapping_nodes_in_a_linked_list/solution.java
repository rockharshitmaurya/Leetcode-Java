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
      //  ListNode temp=head,start=null;
      //   //ListNode swap=new ListNode();
      //   int len=0;
      //   while(temp!=null){
      //       len++;
      //       if(len==k) start=temp;
      //       temp=temp.next;
      //   }
      //   int loop=0;
      //   temp=head;
      //  while(loop!=len-k){
      //      temp=temp.next;
      //      loop++;
      //  }
      //   int val=0;
      //   val=temp.val;
      //   temp.val=start.val;
      //   start.val=val;
      // return head;
        ListNode slow=head,fast=head,start=null;
        for(int i=1; i<k; i++) fast=fast.next;
        start=fast;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int val=start.val;
        start.val=slow.val;
        slow.val=val;
        return head;
    }
}