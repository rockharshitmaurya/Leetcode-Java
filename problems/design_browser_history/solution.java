class BrowserHistory {
    class Node{
        String url;
        Node next,prev;
        Node(String url){
            this.url=url;
            next=null;
            prev=null;
        }
    }
    Node cur,head;
    public BrowserHistory(String homepage) {
        head=new Node(homepage);
        cur=head;
    }
    
    public void visit(String url) {
        Node node=new Node(url);
        cur.next=node;
        node.prev=cur;
        cur=node;
    }
    
    public String back(int steps) {
        while(cur.prev!=null && steps-->0){
            cur=cur.prev;
        }
        return cur.url;
    }
    
    public String forward(int steps) {
          while(cur.next!=null && steps-->0){
            cur=cur.next;
        }
        return cur.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */