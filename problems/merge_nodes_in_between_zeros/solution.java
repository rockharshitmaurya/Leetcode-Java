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
    public ListNode mergeNodes(ListNode head) {
       ListNode ans=new ListNode(0,new ListNode());
        ListNode temp=ans;
        int sum=0;
        head=head.next;
        while(head!=null){
            if(head.val==0){
                temp.next=new ListNode(sum);
                // System.out.print(sum+" ");
                temp=temp.next;
                sum=0;
            }
            sum+=head.val;
            head=head.next;
        }
        return ans.next;
    }
}