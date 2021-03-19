/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> list=new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
       // List<Integer> list=new ArrayList<Integer>();
       //  if(root==null) return list;
       //  Stack<Node> stack=new Stack<Node>();
       //  stack.push(root);
       //  while(!stack.isEmpty()){
       //      root=stack.pop();
       //      list.add(root.val);
       //      for(Node node:root.children){
       //          stack.add(node);
       //      }
       //  }
       //  Collections.reverse(list);
       //  return list;
        if(root==null) return list;
        for(Node node:root.children) postorder(node);
        list.add(root.val);
        return list;
    }
}
