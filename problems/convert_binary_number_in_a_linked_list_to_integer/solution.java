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
    public int getDecimalValue(ListNode head) {
        // String s="";
        // while(head!=null){
        //     s+=head.val;
        //     head=head.next;
        // }
        // //System.out.println(s);
        // return Integer.parseInt(s,2);
        int num = 0;                // Initialise num to 0
	    while(head!=null) {         // Iteratore over the linked list until head is null    
	num <<= 1;   //num*=2;           // Left shift num by 1 position to make way for next bit
		num += head.val;        // Add next bit to num at least significant position
		head = head.next;       // Update head
	}
	return num;
    }
}