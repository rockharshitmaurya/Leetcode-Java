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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1,temp1=list1;
        for(int i=1; i<a; i++)
            temp=temp.next;
        for(int i=0; i<b; i++)
            temp1=temp1.next;
        temp.next=list2;
        temp=list2;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=temp1.next;
        // System.out.println(temp.val+" "+temp1.val);
        return list1;
    }
}