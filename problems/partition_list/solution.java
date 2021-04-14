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
    public ListNode partition(ListNode head, int x) {
        ListNode frontd=new ListNode(0),backd=new ListNode(0),front=frontd,back=backd,cur=head;
        while(cur!=null){
            if(cur.val<x){
                front.next=cur;
                front=cur;
            }else{
                back.next=cur;
                back=cur;
            }
            cur=cur.next;
        }
        front.next=backd.next;
        back.next=null;
        return frontd.next;
        
    }
}