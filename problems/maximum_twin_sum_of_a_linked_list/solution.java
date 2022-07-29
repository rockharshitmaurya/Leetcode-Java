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
    public int pairSum(ListNode head) {
        return sum(head,new ListNode[]{head});
    }
    
    int sum(ListNode head,ListNode arr[]){
        if(head==null) return 0;
        int value=sum(head.next,arr);
        int start=arr[0].val; arr[0]=arr[0].next;
        int end=head.val;
        return Math.max(value,start+end);
    }
}