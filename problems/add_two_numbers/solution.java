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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1,head2=l2;
        ListNode res= new ListNode(0),  temp=res;
        int carry=0;
        while(head1!=null || head2!=null || carry!=0){
            
            if(head1!=null){
                carry+=head1.val;
                head1=head1.next;
            }
            if(head2!=null){
                carry+=head2.val;
                head2=head2.next;
            }
            temp.next=new ListNode(carry%10);
            temp=temp.next;
            carry=carry/10;
        }
        return res.next;
    }
}