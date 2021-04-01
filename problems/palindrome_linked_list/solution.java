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
    public boolean isPalindrome(ListNode head) {
       // Stack<Integer> stack=new Stack<Integer>();
       //  if(head.next==null) return true;
       //  stack.push(head.val);
       //  head=head.next;
       //  while(head!=null){
       //      // System.out.println(stack);
       //      if(!stack.isEmpty() && stack.peek()==head.val){
       //          stack.pop();
       //      }else{
       //          stack.push(head.val);
       //      }
       //      head=head.next;
       //  }
       //  return stack.isEmpty();
        // ArrayList<Integer> arr=new ArrayList<>();
        // while(head!=null){
        //     arr.add(head.val);
        //     head=head.next;
        // }
        // int len=arr.size();
        // for(int i=0; i*2<len; i++){
        //     if(arr.get(i)!=arr.get(len-i-1)) return false;
        // }
        // return true;
        ListNode temp = head;
        Stack stack = new Stack();
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        
        while (head != null) {
            if (head.val != (int)stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}