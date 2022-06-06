/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA,b=headB;
        while(a!=b){
            a=a.next;
            b=b.next;
            if(a==null && b!=null) a=headB;
            if(b==null && a!=null) b=headA;
        }
        return a;
    }
}
//  3 null
//2 3 null