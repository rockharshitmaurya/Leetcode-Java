class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Node> stack=new Stack<>();
        // StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            if(stack.size()>0 && stack.peek().c==c){
                // stack.push(c,stack.peek().getValue()+1);
                stack.peek().count++;
            } 
            else{
               stack.push(new Node(c,1)); 
            }
            if(stack.peek().count==k) stack.pop();
        }
        StringBuilder str=new StringBuilder();
        for(Node n:stack){
            str.append(String.valueOf(n.c).repeat(n.count));
        }
      //  System.out.println(stack);
        return str+"";
    }
}
class Node{
    char c;
    int count;
    public Node(char c, int count){
        this.c=c;
        this.count=count;
    }
}

// aa
// ddbbdbaa