/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node cur=head,front=head;
        while(cur!=null){
            front=cur.next;
            Node dummy=new Node(cur.val);
            cur.next=dummy;
            dummy.next=front;
            cur=front;
        }
        cur=head;front=head;
        while(cur!=null){
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
        cur=head;front=head;
        Node copy=new Node(0);
        Node ans=copy;
        while(cur!=null){
            front=cur.next.next;
            copy.next=cur.next;
            cur.next=front;
            cur=cur.next;
            copy=copy.next;
        }
        return ans.next;
    }
}