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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int len=0;
        ListNode temp=head,end=null;
        while(temp!=null){
            len++;
            if(temp.next==null) end=temp;
            temp=temp.next;
        }
        k=k%len;
        if(k==0) return head; 
        len-=k;
        int len2=0;
        temp=head;
        // System.out.println(len+" "+len2);
        while(len2!=(len-1)){
            len2++;
            temp=temp.next;
        }
        ListNode t=head;
        head=temp.next;
        temp.next=null;
        end.next=t;
        
        // System.out.println(temp.val);
        return head;
    }
}